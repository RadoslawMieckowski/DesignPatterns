package Patterns.creation.builders.fluent;

public class Main {
    public static void main(String[] args) {
        Car car=new Car.CarBuilder()
                .color("Black")
                .age(30)
                .brand("Porshe")
                .build();
        System.out.println(car.toString());

        Person person= new Person.PersonBuilder()
                .surName("Kowalski")
                .name("Adam")
                .country("Poland")
                .age(24)
                .build();
        System.out.println(person.toString());
    }
}
