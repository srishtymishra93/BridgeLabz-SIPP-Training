import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String school;

    Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("School: " + school);
    }
}

public class EmployeeManagementSystem {
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

        // Do not close Scanner as per instructions
    }
}
