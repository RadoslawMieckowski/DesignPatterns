package Patterns.creation.builders.classic.dinner.models;

public class Dinner {
    private Soup soup;
    private MainCourse mainCourse;

    public Soup getSoup() {
        return soup;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    @Override
    public String toString() {
        return "Dinner{" +
                "soup=" + soup +
                ", mainCourse=" + mainCourse +
                '}';
    }
}
