package Patterns.creation.prototype;

public abstract class Person implements Cloneable {
    private String name;
    private int age;

    public abstract void doSomething();

    public Object clone(){
        Object clone =null;
        try {
            clone =super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
