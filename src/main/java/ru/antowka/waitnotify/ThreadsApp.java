package ru.antowka.waitnotify;

/**
 * Created by anikanor on 18.10.2016.
 */
public class ThreadsApp {

    public void startProcess() {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t2.start();
        t1.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
