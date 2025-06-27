public class Account_main {
    public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount b1 = new BankAccount("BA12345", "Rahul Sharma", 10000.0);
        b1.displayAccountInfo();
        b1.deposit(2000);
        b1.withdraw(1500);
        System.out.println("Updated Balance: ₹" + b1.getBalance());

        System.out.println("\n---------------------------");

        // Create a SavingsAccount object
        SavingsAccount s1 = new SavingsAccount("SA54321", "Sneha Kapoor", 20000.0, 4.5);
        s1.displaySavingsInfo();
        s1.deposit(3000);
        s1.withdraw(5000);
        System.out.println("Updated Balance: ₹" + s1.getBalance());
    }
}
}
