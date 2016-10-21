package ru.antowka.hashmapconcurency;

import java.util.HashMap;

/**
 * Пишет занчения из HashMap!!!
 */
public class ThreadWriter extends Thread {

    private HashMap<Integer, Integer> hashMap;

    public void setHashMap(HashMap<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {

        for (int i=100; i > 0; i--) {

            int key = (int) (Math.random() * (100 - 100000));
            int value = (int) (Math.random() * (1 - 100));

            System.out.println("Added elem with KEY: " + key + " VALUE: " + value);
            hashMap.put(key, value);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
