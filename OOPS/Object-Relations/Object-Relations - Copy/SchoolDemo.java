import java.util.Scanner;

public class SchoolDemo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Aggregation: School has students
        school.addStudent(student1);
        school.addStudent(student2);

        // Association: Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        // Show students in school
        school.showStudents();

        // Show courses each student is enrolled in
        student1.showCourses();
        student2.showCourses();

        // Show students enrolled in each course
        course1.showStudents();
        course2.showStudents();
    }
}
