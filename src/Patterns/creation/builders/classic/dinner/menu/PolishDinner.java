package Patterns.creation.builders.classic.dinner.menu;

import Patterns.creation.builders.classic.dinner.DinnerBuilder;
import Patterns.creation.builders.classic.dinner.models.Dinner;
import Patterns.creation.builders.classic.dinner.models.MainCourse;
import Patterns.creation.builders.classic.dinner.models.Soup;

public class PolishDinner implements DinnerBuilder {
    private Dinner dinner;

    public PolishDinner(){
        dinner=new Dinner();
    }

    @Override
    public void serveSoup() {
        Soup soup=new Soup();
        soup.setName("Flaki");
        dinner.setSoup(soup);
    }

    @Override
    public void serveMainCourse() {
        MainCourse mainCourse=new MainCourse();
        mainCourse.setName("Kaczka z jabłkami");
        dinner.setMainCourse(mainCourse);
    }

    @Override
    public Dinner getDinner() {
        return dinner;
    }
}

