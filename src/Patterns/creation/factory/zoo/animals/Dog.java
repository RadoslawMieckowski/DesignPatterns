package Patterns.creation.factory.zoo.animals;

import Patterns.creation.factory.zoo.Animal;

public class Dog implements Animal {

    @Override
    public void doSomething() {
        System.out.println("Dog is fetching!");
    }
}
