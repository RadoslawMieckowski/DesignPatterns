package Patterns.creation.builder.dinner;

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
        mainCourse.setName("Kaczka z jabłkaki");
        dinner.setMainCourse(mainCourse);
    }

    @Override
    public Dinner getDinner() {
        return dinner;
    }
}
