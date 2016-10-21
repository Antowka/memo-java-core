package ru.antowka;

import org.junit.Test;
import ru.antowka.interfacetest.Builder;
import ru.antowka.interfacetest.Pilot;
import ru.antowka.interfacetest.Worker;

/**
 * Множественная имлементация интерфейсов
 */
public class InterfaceTest {

    @Test
    public void test() {

        Builder builder = new Worker();
        System.out.printf("BUILDER: ");
        builder.work();
        builder.build();

        Pilot pilot = new Worker();
        System.out.printf("PILOT: ");
        pilot.work();
        pilot.fly();
    }
}
