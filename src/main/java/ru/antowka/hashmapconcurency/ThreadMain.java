package ru.antowka.hashmapconcurency;

import java.util.HashMap;

/**
 * Created by anikanor on 19.10.2016.
 */
public class ThreadMain {

    public void startProcess() {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        ThreadReader reader = new ThreadReader();
        ThreadWriter writer = new ThreadWriter();

        reader.setHashMap(hashMap);
        writer.setHashMap(hashMap);

        writer.start();
        reader.start();

        try {
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
