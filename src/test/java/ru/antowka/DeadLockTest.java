package ru.antowka;

import org.junit.Test;
import ru.antowka.deadlock.ThreadMain;

/**
 * Много поточность
 */
public class DeadLockTest {

    @Test
    public void test() {
        ThreadMain threadMain = new ThreadMain();
        threadMain.startProcess();
    }
}
