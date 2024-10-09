// Subclass: CheckingAccount
public class CheckingAccount extends BankAccount {
    // Constructor
    public CheckingAccount(double initialAmount, String accountNumber) {
        this.super(initialAmount, accountNumber); // Call the constructor of BankAccount
    }

}
