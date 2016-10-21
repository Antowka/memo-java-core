package ru.antowka.innerclasses;

/**
 * Created by anikanor on 18.10.2016.
 */
public class Dog extends Pets {

    public void whereDogSleeping() {
        super.sleepingAtHome();
    }

    private void whereSleepPetDog() {
        super.sleepingAtHome();
    }



    public class WildDog extends Animals {

        public void whereDogSleeping() {
            super.sleepingAtForest();
        }

        /**
         * Метод имеет доступ через класс обёртку к другому родительскому классу
         */
        public void wherePetDogSleeping() {
            whereSleepPetDog();
        }
    }
}
