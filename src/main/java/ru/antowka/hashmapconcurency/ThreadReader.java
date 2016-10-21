package ru.antowka.hashmapconcurency;

import java.util.HashMap;
import java.util.Set;

/**
 * Читает занчения из HashMap
 */
public class ThreadReader extends Thread {

    private HashMap<Integer, Integer> hashMap;

    public void setHashMap(HashMap<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {

        for (int i=0; i < 100; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Set<Integer> keys = hashMap.keySet();

            if (hashMap.size() > i) {
                Integer key = (Integer) keys.toArray()[i];
                System.out.println("Got elem with KEY:" + key + " VALUE:" + hashMap.get(key));
                System.out.println("HashMap SIZE: " + hashMap.size());
            } else {
                i--;
            }
        }
    }
}
