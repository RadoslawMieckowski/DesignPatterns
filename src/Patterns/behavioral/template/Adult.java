package Patterns.behavioral.template;

public class Adult extends Person{

    @Override
    public void workOut() {
        System.out.println("Adult lifts 70 kg.");
    }

    @Override
    public void rest() {
        System.out.println("Adult rests from lifting.");
    }

    @Override
    public void goHome() {
        System.out.println("Adult goes back home by a car.");
    }

}
