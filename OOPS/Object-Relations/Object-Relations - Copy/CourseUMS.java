import java.util.ArrayList;

public class CourseUMS {
    private String name;
    private ArrayList<StudentUMS> students;
    private Professor professor;

    public CourseUMS(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(StudentUMS student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course " + name);
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (StudentUMS student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
