package ru.antowka;

import org.junit.Test;
import ru.antowka.innerclasses.Dog;

/**
 * реализация вложенных классов
 */
public class InnerClasses {

    @Test
    public void test() {
        Dog dog = new Dog();
        Dog.WildDog wildDog = dog.new WildDog();
        dog.whereDogSleeping();
        wildDog.whereDogSleeping();
        wildDog.wherePetDogSleeping(); //Метод имеет доступ к классу обёртке и другому унаследованному классу
    }
}
