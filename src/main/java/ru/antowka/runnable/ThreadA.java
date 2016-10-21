package ru.antowka.runnable;

/**
 * Дополнительный поток
 */
public class ThreadA implements Runnable {

    public void run () {

        for (int i = 10; i > 0; i--) {

            System.out.println("Дополнительный поток...");

            try {

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Остановка дополнительного потока...");
                    return; //выход из потока
                } else {
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                System.out.println("Exception");
                Thread.currentThread().interrupt();
            }
        }
    }
}
