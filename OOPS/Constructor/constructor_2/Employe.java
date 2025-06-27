package Employee.java;
public class Employe{
    public static void main(String[] args) {
        // Creating an Employee
        Employee e1 = new Employee(1001, "IT", 45000);
        e1.displayEmployeeDetails();
        e1.setSalary(48000);
        System.out.println("Updated Salary: ₹" + e1.getSalary());

        System.out.println("\n--------------------------");

        // Creating a Manager
        Manager m1 = new Manager(2001, "Sales", 75000, 10);
        m1.displayManagerDetails();
        m1.setSalary(80000);
        System.out.println("Updated Manager Salary: ₹" + m1.getSalary());
    }
}