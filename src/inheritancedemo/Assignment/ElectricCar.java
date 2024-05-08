package inheritancedemo.Assignment;

public class ElectricCar extends Car{
    double batteryCapacity;
    public ElectricCar(String make, String model, int year, int numDoors, double batteryCapacity)
    {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }
    public void chargebattery()
    {
        System.out.println("print electric cars battery capacity : " +batteryCapacity);
    }
}


