package inheritancedemo.Assignment;

public class Motorcycle extends Vehicle{

    int numCylinders;
    public Motorcycle( String make, String model, int year, int numCylinders){
     super( make, model, year);
      this.numCylinders = numCylinders;
    }
    public void printnumCylinders()
    {
        System.out.println("Number of cylinder motorcycle has : " +numCylinders);
    }
}
