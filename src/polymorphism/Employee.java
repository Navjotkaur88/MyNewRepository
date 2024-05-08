package polymorphism;

public class Employee {
    int employeeID;
    String employeeName;

    public Employee(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    public int getEmployeeID() {
        System.out.println("Employee Id is :" + employeeID);
        return employeeID;
    }
    public String getEmployeeName()
    {
        System.out.println("Employee name is :" + employeeName);
        return employeeName;
    }
    public double calculatePay(){
        return 0.0;
    }
}
