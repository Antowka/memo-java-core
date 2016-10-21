package ru.antowka;

import org.junit.Test;
import ru.antowka.threads.ThreadMain;

/**
 * Много поточность
 */
public class ThreadTest {

    @Test
    public void test() {
        ThreadMain threadMain = new ThreadMain();
        threadMain.startProccess();
    }
}
