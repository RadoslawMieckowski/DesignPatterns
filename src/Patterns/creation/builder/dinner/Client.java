package Patterns.creation.builder.dinner;

public class Client {
    public static void main(String[] args) {
        DinnerBuilder polishDinnerBuilder =new PolishDinner();
        DinnerDirector polishDinnerDirector =new DinnerDirector(polishDinnerBuilder);
        polishDinnerDirector.makeDinner();
        Dinner polishDinner = polishDinnerDirector.getDinner();
        System.out.println(polishDinner);

        DinnerBuilder frenchDinnerBuilder=new FrenchDinner();
        DinnerDirector frenchDinnerDirector=new DinnerDirector(frenchDinnerBuilder);
        frenchDinnerDirector.makeDinner();
        Dinner frenchDinner=frenchDinnerDirector.getDinner();
        System.out.println(frenchDinner);
    }

}
