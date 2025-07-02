import java.util.Scanner;

public class MainEmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Alice", 101, 90000, 5);
        employees[1] = new Developer("Bob", 102, 80000, "Java");
        employees[2] = new Intern("Charlie", 103, 30000, "State University");

        for (Employee emp : employees) {
            System.out.println("-----");
            emp.displayDetails();
        }

    }
}
