package Patterns.creation.factory.zoo;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory=new AnimalFactory();
        Animal dog=animalFactory.getAnimal("dog");
        dog.doSomething();
        Animal bird= animalFactory.getAnimal("bird");
        bird.doSomething();
        Animal rabbit= animalFactory.getAnimal("rabbit");
        rabbit.doSomething();
        Animal fish= animalFactory.getAnimal("fish");
        fish.doSomething();

    }

}
