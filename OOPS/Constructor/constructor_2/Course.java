public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class variable 
    private static String instituteName = "GLA University";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " weeks");
        System.out.println("Fee           : ₹" + fee);
        System.out.println();
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
