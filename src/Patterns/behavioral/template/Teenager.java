package Patterns.behavioral.template;

public class Teenager extends Person{

    @Override
    public void workOut() {
        System.out.println("Teenager runs on the treadmill");
    }

    @Override
    public void rest() {
        System.out.println("Teenager rests from running");
    }

    @Override
    public void goHome() {
        System.out.println("Teenager goes back home by a bus");
    }
}
