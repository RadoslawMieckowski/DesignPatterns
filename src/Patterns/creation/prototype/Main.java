package Patterns.creation.prototype;

public class Main {
    public static void main(String[] args) {
        PeopleHashMap.loadPeople();

        Person person1=PeopleHashMap.getPerson("John");
        Person person2=PeopleHashMap.getPerson("Mark");
        Person person3=PeopleHashMap.getPerson("Robert");

        person1.doSomething();
        person2.doSomething();
        person3.doSomething();

    }

}
