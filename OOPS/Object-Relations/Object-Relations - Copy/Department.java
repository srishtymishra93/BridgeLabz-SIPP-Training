import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        System.out.println("Employees in " + name + ":");
        for (Employee emp : employees) {
            System.out.println("  - " + emp.getName());
        }
    }
}
