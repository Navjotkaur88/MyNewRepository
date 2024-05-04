package inheritancedemo;

public class Vehicle {

    // needs constructor to initialize objects
    String color;
    String make;
    String model;
    int speed;
    int year;
    int price;

    public Vehicle(String color, String make, String model, int speed, int year, int price) {

        this.color = color;
        this.make = make;
        this.model = model;
        this.speed = speed;
        this.year = year;
        this.price = price;

    }
    public void printCardetail() {
        System.out.println("Color : " + color);
        System.out.println("Color : " + make);
        System.out.println("Color : " + model);
        System.out.println("Color : " + speed);
        System.out.println("Color : " + year);
        System.out.println("Color : " + price);

    }
}