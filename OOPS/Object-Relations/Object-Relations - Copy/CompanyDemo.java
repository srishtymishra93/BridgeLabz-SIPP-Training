import java.util.Scanner;

public class CompanyDemo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");
        Employee emp3 = new Employee("Charlie");

        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);
        dept2.addEmployee(emp3);

        company.addDepartment(dept1);
        company.addDepartment(dept2);

        System.out.println("Company structure before deletion:");
        company.showDepartments();

        // Simulate deleting company
        company.removeAllDepartments();

        System.out.println("Company structure after deletion:");
        company.showDepartments();
    }
}
