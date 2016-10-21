package ru.antowka;

import org.junit.Test;
import ru.antowka.hashmapconcurency.ThreadMain;

/**
 * Многопоточноя работа с HashMap
 */
public class HashMapConcurency {

    @Test
    public void test() {
        ThreadMain threadMain = new ThreadMain();
        threadMain.startProcess();
    }
}
