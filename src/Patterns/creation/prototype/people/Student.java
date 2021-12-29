package Patterns.creation.prototype.people;

import Patterns.creation.prototype.Person;

public class Student extends Person {
    @Override
    public void doSomething() {
        System.out.println("Go to university!");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
}
