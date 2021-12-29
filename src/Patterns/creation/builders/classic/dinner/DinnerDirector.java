package Patterns.creation.builders.classic.dinner;

import Patterns.creation.builders.classic.dinner.models.Dinner;

public class DinnerDirector {
    private DinnerBuilder dinnerBuilder;
    public DinnerDirector(DinnerBuilder dinnerBuilder) {
        this.dinnerBuilder=dinnerBuilder;
    }
    public void makeDinner(){
        dinnerBuilder.serveSoup();
        dinnerBuilder.serveMainCourse();
    }
    public Dinner getDinner(){
        return this.dinnerBuilder.getDinner();
    }
}
