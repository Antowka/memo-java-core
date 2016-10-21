package ru.antowka.deadlock;

/**
 * Created by anikanor on 18.10.2016.
 */
public class ThreadA extends Thread {

    private Type type;
    private Target target;

    public enum Type {
        A, B
    }

    @Override
    public void run() {

        for (int i = 5; i > 0; i--) {
            switch (type) {

                case A:
                    target.printTextA();
                    break;

                case B:
                    target.printTextB();
                    break;
            }
        }
    }


    public void setTarget(Target target) {
        this.target = target;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
