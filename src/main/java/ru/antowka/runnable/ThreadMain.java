package ru.antowka.runnable;

/**
 * Основной поток
 */
public class ThreadMain {

    public void startProccess() {
        System.out.println("Старт основного потока");
        Thread threadA = new Thread(new ThreadA());
        threadA.start();
        System.out.println("Финиш основного потока");

        try {
            Thread.sleep(5000);
            threadA.interrupt(); //останавливаем поток
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
