import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (BankAccount account : accounts) {
            System.out.println("- Account at " + account.getBankName() + ": $" + account.getBalance());
        }
    }
}
