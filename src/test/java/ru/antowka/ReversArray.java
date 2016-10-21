package ru.antowka;

import org.junit.Test;

/**
 * Переворот массива
 */
public class ReversArray {

    @Test
    public void reversArray() {

        Integer[] test = new Integer[11];
        for(int i = 1; i <= 11; i++) {
            test[i-1] = i;
        }

        for(int i=0; i<test.length/2; i++) {
            int tmp = test[test.length-1-i];
            test[test.length-1-i] = test[i];
            test[i] = tmp;
        }

        for (Integer testElem: test) {
            System.out.printf("[" + testElem + "]");
        }
    }
}
