package ru.antowka.interfacetest;

/**
 *  Множественное инмплементация интерфейсов
 */
public class Worker implements Builder, Pilot {

    public void work() {
        System.out.println("Builder and Pilot are working...");
    }

    public void build() {
        System.out.println("Builder id building...");
    }

    public void fly() {
        System.out.println("Pilot is flying...");
    }
}
