package Patterns.creation.builder.dinner;

import Patterns.creation.builder.dinner.models.Dinner;

public interface DinnerBuilder {

    public void serveSoup();
    public void serveMainCourse();
    public Dinner getDinner();
}
