package ru.antowka.waitnotify;

/**
 * Created by anikanor on 18.10.2016.
 */
public class Consumer implements Runnable {

    Store store;

    Consumer(Store store){
        this.store = store;
    }

    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}