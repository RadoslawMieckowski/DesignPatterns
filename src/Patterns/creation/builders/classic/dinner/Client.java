package Patterns.creation.builders.classic.dinner;

import Patterns.creation.builders.classic.dinner.menu.FrenchDinner;
import Patterns.creation.builders.classic.dinner.menu.ItalianDinner;
import Patterns.creation.builders.classic.dinner.menu.PolishDinner;
import Patterns.creation.builders.classic.dinner.models.Dinner;

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

        DinnerBuilder italianDinnerBuilder=new ItalianDinner();
        DinnerDirector italianDinnerDirector=new DinnerDirector(italianDinnerBuilder);
        italianDinnerDirector.makeDinner();
        Dinner italianDinner= italianDinnerDirector.getDinner();
        System.out.println(italianDinner);
    }

}
