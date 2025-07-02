import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeAllDepartments() {
        departments.clear();
        System.out.println("All departments and employees removed as company is deleted.");
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department dept : departments) {
            System.out.println("- " + dept.getName());
            dept.showEmployees();
        }
    }
}
