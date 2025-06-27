public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudent() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
    }
}
 class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);  // Call parent constructor
        this.specialization = specialization;
    }

    public void displayPostgraduateStudent() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name          : " + name); // accessing protected member
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA          : " + getCGPA());
    }
}