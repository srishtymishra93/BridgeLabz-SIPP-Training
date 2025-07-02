import java.util.Scanner;

public class UniversityManagementDemo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        StudentUMS student1 = new StudentUMS("Alice");
        StudentUMS student2 = new StudentUMS("Bob");

        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        CourseUMS course1 = new CourseUMS("Mathematics");
        CourseUMS course2 = new CourseUMS("Physics");

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        // Show courses each student is enrolled in
        student1.showCourses();
        student2.showCourses();

        // Show students in each course
        course1.showStudents();
        course2.showStudents();
    }
}
