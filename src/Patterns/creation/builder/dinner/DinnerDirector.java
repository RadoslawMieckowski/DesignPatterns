package Patterns.creation.builder.dinner;

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
