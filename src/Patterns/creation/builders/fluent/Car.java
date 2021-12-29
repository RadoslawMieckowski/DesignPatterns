package Patterns.creation.builders.fluent;

public class Car {
    private String color;
    private int age;
    private String brand;
    private Car(CarBuilder carBuilder){
        this.color= carBuilder.color;
        this.age= carBuilder.age;
        this.brand= carBuilder.brand;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getBrand() {
        return brand;
    }

    public static class CarBuilder{
        private String color;
        private int age;
        private String brand;

        public CarBuilder color(String color){
            this.color=color;
            return this;
        }
        public CarBuilder age(int age){
            this.age=age;
            return this;
        }
        public CarBuilder brand(String brand){
            this.brand=brand;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                '}';
    }
}
