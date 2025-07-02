import java.util.ArrayList;

public class StudentUMS {
    private String name;
    private ArrayList<CourseUMS> courses;

    public StudentUMS(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(CourseUMS course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (CourseUMS course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}
