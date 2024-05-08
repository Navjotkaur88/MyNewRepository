package polymorphism;

public class PartTimeEmployee extends Employee {
    double baseSalary;
    double bonus;

    public PartTimeEmployee(int EmployeeId, String EmployeeName, double baseSalary, double bonus) {
        super(EmployeeId, EmployeeName);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculatePay() {
        double salary = baseSalary + bonus;
        {
            System.out.println("This employee is part time with " + salary + "salary");
            return salary;
        }
    }
}
