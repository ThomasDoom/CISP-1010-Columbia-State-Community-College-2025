public class BankAccount {
    // Fields
    private String accountNumber,
                   accountHolder;
    private double balance;

    // Constructors
    public BankAccount() {
        this.accountNumber = "000000";
        this.accountHolder = "Unknownd";
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters
    public String getAccountHolder() { return accountHolder; }

    public String getAccountNumber() { return accountNumber; }

    public double getBalance() { return balance; }

    // Setters
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }

    // Methods
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("\nERROR: Rejected deposit amount!\n");
            return;
        }
        balance += amount;
        System.out.printf("Depositing: $%.2f%n", amount);
        System.out.printf("New Balance: $%.2f%n", getBalance());
    }

    public void deposit(double amount, String description) {
        if (amount <= 0) {
            System.out.println("\nERROR: Rejected deposit amount!\n");
            return;
        }
        balance += amount;
        System.out.printf("Depositing: $%.2f - %s%n", amount, description);
        System.out.printf("New Balance: $%.2f%n", getBalance());
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > getBalance()) {
            System.out.println("\nERROR: Rejected withdraw amount!\n");
            return;
        }
        balance -= amount;
        System.out.printf("Withdrawing: $%.2f%n", amount);
        System.out.printf("New Balance: $%.2f%n", getBalance());
    }

    public void withdraw(double amount, String description) {
        if (amount <= 0 || amount > getBalance()) {
            System.out.println("\nERROR: Rejected withdraw amount!\n");
            return;
        }
        balance -= amount;
        System.out.printf("Withdrawing: $%.2f - %s%n", amount, description);
        System.out.printf("New Balance: $%.2f%n", getBalance());
    }

    public void displayAccountInfo() {
        System.out.printf("Account: %s%n", getAccountNumber());
        System.out.printf("Name: %s%n", getAccountHolder());
        System.out.printf("Balance: $%.2f%n", getBalance());
        System.out.println();
    }



}