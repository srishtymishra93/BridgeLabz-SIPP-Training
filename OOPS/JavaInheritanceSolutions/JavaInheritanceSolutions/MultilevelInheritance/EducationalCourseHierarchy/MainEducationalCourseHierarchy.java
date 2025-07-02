import java.util.Scanner;

public class MainEducationalCourseHierarchy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 40, "Udemy", true, 200.0, 15.0);

        System.out.println("Course Name: " + paidCourse.courseName);
        System.out.println("Duration: " + paidCourse.duration + " hours");
        System.out.println("Platform: " + paidCourse.platform);
        System.out.println("Is Recorded: " + (paidCourse.isRecorded ? "Yes" : "No"));
        System.out.println("Original Fee: $" + paidCourse.fee);
        System.out.println("Discount: " + paidCourse.discount + "%");
        System.out.println("Discounted Fee: $" + paidCourse.getDiscountedFee());

        // Do not close Scanner as per instructions
    }
}
