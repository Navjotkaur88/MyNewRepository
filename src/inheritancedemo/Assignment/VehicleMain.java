package inheritancedemo.Assignment;

public class VehicleMain {
    public static void main(String [] args){
        Car c = new Car("1987", "778", 1978, 4);
        c.printnumDoors();
        c.start();;
        Motorcycle m = new Motorcycle("1956","1977", 1988, 2000);
        {
         m.printnumCylinders();
        }
        //+Vehicle v = new Vehicle(String make, String model, int year);
    }
}
