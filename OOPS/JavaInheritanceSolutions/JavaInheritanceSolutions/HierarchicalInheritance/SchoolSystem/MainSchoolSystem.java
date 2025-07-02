import java.util.Scanner;

public class MainSchoolSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Alice", 16, "10th Grade");
        Staff staff = new Staff("Bob", 35, "Administration");

        teacher.displayRole();
        System.out.println("-----");
        student.displayRole();
        System.out.println("-----");
        staff.displayRole();


    }
}
