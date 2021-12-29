package Patterns.creation.factory.zoo.animals;

import Patterns.creation.factory.zoo.Animal;

public class Rabbit implements Animal {


    @Override
    public void doSomething() {
        System.out.println("Rabbit is jumping!");
    }
}
