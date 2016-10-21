package ru.antowka;

import org.junit.Test;
import ru.antowka.abstracttest.Driver;
import ru.antowka.abstracttest.Person;

/**
 * Created by anikanor on 18.10.2016.
 */
public class AbstractTest {

    @Test
    public void test() {

        Person p1 = new Driver();
        Driver d1 = (Driver)p1;
        d1.update();
        d1.work();
        d1.editPerson();
    }
}
