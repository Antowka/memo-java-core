package ru.antowka.abstracttest;

public abstract class Person {

    public void update() {
        System.out.println("Person update");
    }

    abstract void editPerson();
}
