package ru.antowka.threads;

/**
 * Основной поток
 */
public class ThreadMain {

    public void startProccess() {
        System.out.println("Старт основного потока");
        ThreadA threadA = new ThreadA();
        threadA.start();
        System.out.println("Финиш основного потока");

        try {
            Thread.sleep(5000);
            threadA.interrupt();
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
