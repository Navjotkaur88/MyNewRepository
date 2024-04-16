package ClassObjects;

public class Car {
    String color;// = "blue";
    String brand;
    double price;

    public void displayCarInfo()
    {
        System.out.println("Color :" +color);
        System.out.println("brand" +brand);
        System.out.println("price" +price);
    }
}
// Constructor- Initialize the Object, same as a class name, public or by default, give initial value to object and starts with capital letter
 //method has return type constructor does not hold any return type not even void and starts with capital letter