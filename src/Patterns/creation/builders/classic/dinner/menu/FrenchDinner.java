package Patterns.creation.builders.classic.dinner.menu;

import Patterns.creation.builders.classic.dinner.DinnerBuilder;
import Patterns.creation.builders.classic.dinner.models.Dinner;
import Patterns.creation.builders.classic.dinner.models.MainCourse;
import Patterns.creation.builders.classic.dinner.models.Soup;

public class FrenchDinner implements DinnerBuilder {
private Dinner dinner;

    public FrenchDinner(){
        dinner=new Dinner();
    }
    @Override
    public void serveSoup() {
        Soup soup=new Soup();
        soup.setName("zupa cebulowa");
        dinner.setSoup(soup);
    }

    @Override
    public void serveMainCourse() {
        MainCourse mainCourse=new MainCourse();
        mainCourse.setName("wołowina po burgundzku");
        dinner.setMainCourse(mainCourse);
    }

    @Override
    public Dinner getDinner() {
        return dinner;
    }

    @Override
    public String toString() {
        return "FrenchDinner{" +
                "dinner=" + dinner +
                '}';
    }
}
