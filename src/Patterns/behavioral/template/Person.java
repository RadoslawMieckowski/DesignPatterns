package Patterns.behavioral.template;

public abstract class Person {
    public abstract void workOut();
    public abstract void rest();
    public abstract void goHome();

    public final void goToTheGym(){
        workOut();
        rest();
        workOut();
        goHome();
    }
}
