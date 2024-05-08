package polymorphism;

public class FullTimeEmployee extends Employee {
    double baseSalary;
    double bonus;

    public FullTimeEmployee(int EmployeeId, String EmployeeName, double baseSalary, double bonus) {
        super(EmployeeId, EmployeeName);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculatePay() {
        double salary = baseSalary + bonus;
        {
            System.out.println("This employee is full time with " + salary + "salary");
            return salary;
        }
    }
}
