package inheritancedemo.Assignment;

public class Vehicle {

    // needs constructor to initialize objects
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle starts");
    }
    public void stop() {

        System.out.println("The vehicle stops");
    }
    public void displayInfo() {
        System.out.println("make : " + make);
        System.out.println("model : " + model);
        System.out.println("year : " + year);

    }
}