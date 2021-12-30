package Patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        Adult adult=new Adult();
        adult.goToTheGym();

        System.out.println();

        Teenager teenager=new Teenager();
        teenager.goToTheGym();
    }
}
