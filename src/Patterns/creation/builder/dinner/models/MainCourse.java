package Patterns.creation.builder.dinner.models;

public class MainCourse {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MainCourse{" +
                "name='" + name + '\'' +
                '}';
    }
}
