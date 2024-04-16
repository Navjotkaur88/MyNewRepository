package ClassObjects;

public class CarMain {
    public static void main(String[] args)
    {
        Car car = new Car(); // calling constructor
        // Constructor- Initialize the Object, same as a class name, public or by default, give initial value to object and starts with capital letter
        //Every class by default has constructor even you create it or not, method has return type constructor does not hold any return type not even void and starts with capital letter
        car.displayCarInfo();
    }
}
