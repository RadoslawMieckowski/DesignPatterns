package Patterns.creation.factory.zoo.animals;

import Patterns.creation.factory.zoo.Animal;

public class Bird implements Animal {
    @Override
    public void doSomething() {
        System.out.println("Bird is flying!");
    }
}
