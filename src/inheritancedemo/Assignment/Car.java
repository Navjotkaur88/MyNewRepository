package inheritancedemo.Assignment;

public class Car extends Vehicle{

      int numDoors;
    public Car( String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }


    public void printnumDoors(){
        System.out.println("print num of doors car has : " +numDoors);
    }

}
