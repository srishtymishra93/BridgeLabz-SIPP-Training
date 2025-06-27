public class Manager {
    public class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID : " + employeeID);   // Public
        System.out.println("Department  : " + department);   // Protected
        System.out.println("Team Size   : " + teamSize);
        System.out.println("Salary      : ₹" + getSalary()); // Access private via public method
    }
}

}
