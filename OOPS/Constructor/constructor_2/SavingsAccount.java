public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);  // Call parent constructor
        this.interestRate = interestRate;
    }

    // Display savings account info
    public void displaySavingsInfo() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number : " + accountNumber);   // Accessing public member
        System.out.println("Account Holder : " + accountHolder);   // Accessing protected member
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Current Balance: ₹" + getBalance());   // Accessing private member via public method
    }
}
