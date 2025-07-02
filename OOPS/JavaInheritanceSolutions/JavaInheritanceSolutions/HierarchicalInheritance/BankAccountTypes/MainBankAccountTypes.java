import java.util.Scanner;

public class MainBankAccountTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 3000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.0, 12);

        savings.displayAccountType();
        System.out.println("Account Number: " + savings.accountNumber + ", Balance: $" + savings.balance + ", Interest Rate: " + savings.interestRate + "%");
        System.out.println("-----");

        checking.displayAccountType();
        System.out.println("Account Number: " + checking.accountNumber + ", Balance: $" + checking.balance + ", Withdrawal Limit: $" + checking.withdrawalLimit);
        System.out.println("-----");

        fixedDeposit.displayAccountType();
        System.out.println("Account Number: " + fixedDeposit.accountNumber + ", Balance: $" + fixedDeposit.balance + ", Deposit Period: " + fixedDeposit.depositPeriod + " months");


    }
}
