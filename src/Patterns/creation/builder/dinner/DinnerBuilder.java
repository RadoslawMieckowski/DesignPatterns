package Patterns.creation.builder.dinner;

public interface DinnerBuilder {

    public void serveSoup();
    public void serveMainCourse();
    public  Dinner getDinner();
}
