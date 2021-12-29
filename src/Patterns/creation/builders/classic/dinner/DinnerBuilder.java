package Patterns.creation.builders.classic.dinner;

import Patterns.creation.builders.classic.dinner.models.Dinner;

public interface DinnerBuilder {

    public void serveSoup();
    public void serveMainCourse();
    public Dinner getDinner();
}
