package Patterns.creation.builder;

public class Person {
    private String name;
    private String surName;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
    private Person(PersonBuilder personBuilder){
        this.name=personBuilder.name;
        this.surName=personBuilder.surName;
        this.age=personBuilder.age;
        this.country=personBuilder.country;
    }
    public static class PersonBuilder{
        private String name;
        private String surName;
        private int age;
        private String country;

        public PersonBuilder name(String name){
            this.name=name;
            return this;
        }
        public PersonBuilder surName(String surName){
            this.surName=surName;
            return this;
        }
        public PersonBuilder age(int age){
            this.age=age;
            return this;
        }
        public PersonBuilder country(String country){
            this.country=country;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
