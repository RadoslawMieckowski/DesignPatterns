package Patterns.creation.factory.zoo;

import Patterns.creation.factory.zoo.animals.Bird;
import Patterns.creation.factory.zoo.animals.Dog;
import Patterns.creation.factory.zoo.animals.Fish;
import Patterns.creation.factory.zoo.animals.Rabbit;

public class AnimalFactory {
    public Animal getAnimal(String animal){
        if (animal.equals(null))return null;
        else if(animal.equalsIgnoreCase("dog")){
            return new Dog();
        }else if(animal.equalsIgnoreCase("Bird")){
            return new Bird();
        }else if (animal.equalsIgnoreCase("fish")){
            return new Fish();
        }else if(animal.equalsIgnoreCase("Rabbit")){
            return new Rabbit();
        }
        else return null;
    }
}
