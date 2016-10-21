package ru.antowka.deadlock;

/**
 * Created by anikanor on 18.10.2016.
 */
public class Target {

    private Target otherTarget;

    public synchronized void printTextA() {
        otherTarget.printText("Print text A ...");
    }

    public synchronized void printTextB() {
        otherTarget.printText("Print text B ...");
    }

    private synchronized void printText(String text) {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(text);
    }

    public void setOtherTarget(Target otherTarget) {
        this.otherTarget = otherTarget;
    }
}
