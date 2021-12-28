package Patterns.creation.builder.dinner.menu;

import Patterns.creation.builder.dinner.DinnerBuilder;
import Patterns.creation.builder.dinner.models.Dinner;
import Patterns.creation.builder.dinner.models.MainCourse;
import Patterns.creation.builder.dinner.models.Soup;

public class ItalianDinner implements DinnerBuilder {
private Dinner dinner;

public ItalianDinner(){
    dinner=new Dinner();
}
    @Override
    public void serveSoup() {
        Soup soup=new Soup();
        soup.setName("Rosół z pulpecikami drobiowymi");
        dinner.setSoup(soup);
    }

    @Override
    public void serveMainCourse() {
        MainCourse mainCourse=new MainCourse();
        mainCourse.setName("Lasagne");
        dinner.setMainCourse(mainCourse);
    }

    @Override
    public Dinner getDinner() {
        return dinner;
    }

    @Override
    public String toString() {
        return "ItalianDinner{" +
                "dinner=" + dinner +
                '}';
    }
}
