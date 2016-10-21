package ru.antowka.waitnotify;

/**
 * Created by anikanor on 18.10.2016.
 */
public class Store {

    private int product=0;
    private boolean available = false;

    public synchronized void get() {

        System.out.println("GET");
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }

        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }

    public synchronized void put() {

        System.out.println("PUT");
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }

        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}
