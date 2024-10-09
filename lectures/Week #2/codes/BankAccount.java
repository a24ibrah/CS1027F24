// Superclass: BankAccount
public class BankAccount {
    // Attributes
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(double initialAmount, String accountNumber) {
        this.balance = initialAmount;
        this.accountNumber = accountNumber;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Print balance method
    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // toString method
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
