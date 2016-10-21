package ru.antowka;

import org.junit.Test;

/**
 * Сравнение значений с учутом автоупаковки для приметивов
 */
public class Autoboxing {

    @Test
    public void test() {

        int varSimple1 = 123;
        Integer var1 = 123;
        boolean result1 = var1.equals(varSimple1);
        System.out.println("Сравнение Integer.equals(int) возвращает: " + result1);

        boolean result2 = var1==varSimple1;
        System.out.println("Сравнение Integer==int возвращает: " + result2);

        Integer var2_1 = 1000;
        Integer var2_2 = 1000;
        boolean result3 = var2_1.equals(var2_2);
        System.out.println("Сравнение Integer.equals(Integer) возвращает: " + result3);

        boolean result4 = var2_1==var2_2;
        System.out.println("Сравнение Integer==Integer возвращает: " + result4);
    }
}
