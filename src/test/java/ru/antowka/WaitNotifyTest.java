package ru.antowka;

import org.junit.Test;
import ru.antowka.waitnotify.ThreadsApp;

/**
 * Много поточность
 */
public class WaitNotifyTest {

    @Test
    public void test() {
        ThreadsApp threadsApp = new ThreadsApp();
        threadsApp.startProcess();
    }
}
