package Patterns.creation.builder.dinner;

public class Client {
    public static void main(String[] args) {
        DinnerBuilder dinnerBuilder=new PolishDinner();
        DinnerDirector dinnerDirector=new DinnerDirector(dinnerBuilder);
        dinnerDirector.makeDinner();
        Dinner dinner=dinnerDirector.getDinner();
        System.out.println(dinner);
    }

}
