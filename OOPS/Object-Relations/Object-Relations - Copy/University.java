import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<UniversityDepartment> departments;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public void addDepartment(UniversityDepartment department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void removeAllDepartments() {
        departments.clear();
        System.out.println("All departments removed as university is deleted.");
    }

    public void showStructure() {
        System.out.println("University: " + name);

        System.out.println("Departments:");
        for (UniversityDepartment dept : departments) {
            System.out.println("- " + dept.getName());
        }

        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }
}
