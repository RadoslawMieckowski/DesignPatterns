package Patterns.creation.builder;

public class Main {
    public static void main(String[] args) {
        Car car=new Car.CarBuilder()
                .color("Black")
                .age(30)
                .brand("Porshe")
                .build();
        System.out.println(car.toString());
    }
}
