package polymorphism;

public class EmployeeMain {
    public static void main(String [] args){

        FullTimeEmployee fullTime = new FullTimeEmployee(45, "Shankar", 4000.00, 2000.00);
        fullTime.getEmployeeName();
        fullTime.getEmployeeID();
        fullTime.calculatePay();

        PartTimeEmployee partTime = new PartTimeEmployee( 123, "Pretty", 2000.00, 1000.00);
        partTime.getEmployeeName();
        partTime.getEmployeeID();
        partTime.calculatePay();

    }
}
