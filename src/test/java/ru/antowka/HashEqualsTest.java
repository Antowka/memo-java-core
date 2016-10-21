package ru.antowka;

import org.junit.Assert;
import org.junit.Test;
import ru.antowka.hashequals.Employer;

public class HashEqualsTest {

    @Test
    public void test() {

        Employer emp1 = new Employer();
        Employer emp2 = new Employer();

        boolean test = emp1.equals(emp2);

        Assert.assertTrue(test);
    }
}
