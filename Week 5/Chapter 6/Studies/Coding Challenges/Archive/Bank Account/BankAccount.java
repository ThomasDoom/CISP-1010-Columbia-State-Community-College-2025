public class BankAccount {
    // Fields
    private String accountNumber,
                   accountHolder;
    private double balance;

    private static int totalAccounts;

    // Constructors

    // Getters and Setters
    public double getBalance() { return balance; }

    // Methods
    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

}