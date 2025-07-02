import java.util.Scanner;

public class UniversityDemo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        University university = new University("Global University");

        UniversityDepartment dept1 = new UniversityDepartment("Computer Science");
        UniversityDepartment dept2 = new UniversityDepartment("Mathematics");

        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        university.addDepartment(dept1);
        university.addDepartment(dept2);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        System.out.println("University structure before deletion:");
        university.showStructure();

        // Simulate deleting university
        university.removeAllDepartments();

        System.out.println("University structure after deletion:");
        university.showStructure();
    }
}
