package Patterns.creation.prototype;

import Patterns.creation.prototype.people.Graduate;
import Patterns.creation.prototype.people.Schooler;
import Patterns.creation.prototype.people.Student;

import java.util.HashMap;

public class PeopleHashMap {
    private static HashMap <String,Person>personMap= new HashMap<>();

    public static void loadPeople(){
        Student student=new Student();
        student.setName("John");
        student.setAge(20);
        personMap.put(student.getName(),student);

        Schooler schooler=new Schooler();
        schooler.setName("Mark");
        schooler.setAge(13);
        personMap.put(schooler.getName(),schooler);

        Graduate graduate=new Graduate();
        graduate.setName("Robert");
        graduate.setAge(25);
        personMap.put(graduate.getName(), graduate);
    }
    public static Person getPerson(String name){
        Person retrievedPerson=personMap.get(name);     //the most
        return (Person) retrievedPerson.clone();    //important part
    }
}
