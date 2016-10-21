package ru.antowka;

import org.junit.Test;
import ru.antowka.runnable.ThreadMain;

/**
 * Много поточность
 */
public class RunnableTest {

    @Test
    public void test() {
        ThreadMain threadMain = new ThreadMain();
        threadMain.startProccess();
    }
}
