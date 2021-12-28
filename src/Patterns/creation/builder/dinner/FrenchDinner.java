package Patterns.creation.builder.dinner;

public class FrenchDinner implements DinnerBuilder{
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
