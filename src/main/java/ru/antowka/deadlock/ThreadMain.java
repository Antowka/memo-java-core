package ru.antowka.deadlock;

/**
 * Created by anikanor on 18.10.2016.
 */
public class ThreadMain {

    public void startProcess() {

        Target target1 = new Target();
        Target target2 = new Target();

        target1.setOtherTarget(target2);
        target2.setOtherTarget(target1);

        ThreadA threadA = new ThreadA();
        threadA.setTarget(target1);
        threadA.setType(ThreadA.Type.A);

        ThreadA threadB = new ThreadA();
        threadB.setTarget(target2);
        threadB.setType(ThreadA.Type.B);

        threadA.start();
        threadB.start();

        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
