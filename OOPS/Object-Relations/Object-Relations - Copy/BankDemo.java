import java.util.Scanner;

public class BankDemo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        BankAccount account1 = new BankAccount(bank.getName(), 1000.0);
        BankAccount account2 = new BankAccount(bank.getName(), 2500.5);
        BankAccount account3 = new BankAccount(bank.getName(), 500.75);

        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer2.addAccount(account3);

        bank.openAccount(customer1);
        bank.openAccount(customer2);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
