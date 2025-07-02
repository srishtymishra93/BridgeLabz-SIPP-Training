public class BankAccount {
    private String bankName;
    private double balance;

    public BankAccount(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public double getBalance() {
        return balance;
    }
}
