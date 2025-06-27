
    public class Course_Main {
    public static void main(String[] args) {
        // Create course objects
        Course c1 = new Course("Java Programming", 12, 5000.0);
        Course c2 = new Course("Data Structures", 10, 4500.0);

        // Display original course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name using class method
        Course.updateInstituteName("BridgeLabz Academy");

        // Display updated course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}