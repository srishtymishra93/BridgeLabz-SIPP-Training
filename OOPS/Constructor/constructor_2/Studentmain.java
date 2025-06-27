public class Studentmain {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student(101, "Gopal Awasthi", 8.5);
        s1.displayStudent();

        // Modify CGPA
        s1.setCGPA(9.1);
        System.out.println("\nUpdated CGPA: " + s1.getCGPA());

        System.out.println("\n----------------------------");

        // Create a PostgraduateStudent object
        PostgraduateStudent pg = new PostgraduateStudent(201, "Anjali Verma", 9.3, "Computer Science");
        pg.displayPostgraduateStudent();
    }
}
