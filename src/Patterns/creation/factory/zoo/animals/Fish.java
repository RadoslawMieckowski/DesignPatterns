package Patterns.creation.factory.zoo.animals;

import Patterns.creation.factory.zoo.Animal;

public class Fish implements Animal {

    @Override
    public void doSomething() {
        System.out.println("Fish is siwmming!");
    }
}
