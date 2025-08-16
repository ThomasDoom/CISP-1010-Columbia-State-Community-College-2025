public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("=== BANK ACCOUNT TESTING PROGRAM ===\n");

        // Test 1: Default Constructor
        System.out.println("TEST 1: Default Constructor");
        System.out.println("------------------------");
        BankAccount account1 = new BankAccount();
        account1.displayAccountInfo();

        // Test 2: Two-parameter Constructor
        System.out.println("TEST 2: Two-parameter Constructor");
        System.out.println("----------------------------------");
        BankAccount account2 = new BankAccount("123456", "Jane Smith");
        account2.displayAccountInfo();

        // Test 3: Three-parameter Constructor
        System.out.println("TEST 3: Three-parameter Constructor");
        System.out.println("-----------------------------------");
        BankAccount account3 = new BankAccount("789012", "John Doe", 1000.00);
        account3.displayAccountInfo();

        // Test 4: Getter Methods
        System.out.println("TEST 4: Testing Getter Methods");
        System.out.println("------------------------------");
        System.out.println("Account 3 Details:");
        System.out.println("Account Number: " + account3.getAccountNumber());
        System.out.println("Account Holder: " + account3.getAccountHolder());
        System.out.println("Balance: $" + String.format("%.2f", account3.getBalance()));
        System.out.println();

        // Test 5: Setter Method
        System.out.println("TEST 5: Testing Setter Method");
        System.out.println("-----------------------------");
        System.out.println("Changing account holder name from '" + account2.getAccountHolder() +
                          "' to 'Jane Johnson'");
        account2.setAccountHolder("Jane Johnson");
        System.out.println("New account holder: " + account2.getAccountHolder());
        System.out.println();

        // Test 6: Deposit Methods (both overloaded versions)
        System.out.println("TEST 6: Testing Deposit Methods");
        System.out.println("-------------------------------");

        // Simple deposit
        System.out.println("Simple deposit to Account 2:");
        account2.deposit(500.00);
        System.out.println();

        // Deposit with description
        System.out.println("Deposit with description to Account 3:");
        account3.deposit(250.00, "Salary deposit");
        System.out.println();

        // Test 7: Withdraw Methods (both overloaded versions)
        System.out.println("TEST 7: Testing Withdraw Methods");
        System.out.println("--------------------------------");

        // Simple withdrawal
        System.out.println("Simple withdrawal from Account 2:");
        account2.withdraw(150.00);
        System.out.println();

        // Withdrawal with description
        System.out.println("Withdrawal with description from Account 3:");
        account3.withdraw(300.00, "ATM withdrawal");
        System.out.println();

        // Test 8: Validation Testing - Negative Deposits
        System.out.println("TEST 8: Validation - Negative Deposit");
        System.out.println("-------------------------------------");
        System.out.println("Attempting to deposit -$100.00:");
        account2.deposit(-100.00);
        System.out.println("Attempting to deposit -$50.00 with description:");
        account2.deposit(-50.00, "Invalid negative deposit");
        System.out.println();

        // Test 9: Validation Testing - Zero Deposits
        System.out.println("TEST 9: Validation - Zero Deposit");
        System.out.println("---------------------------------");
        System.out.println("Attempting to deposit $0.00:");
        account2.deposit(0.00);
        System.out.println();

        // Test 10: Validation Testing - Overdraft Protection
        System.out.println("TEST 10: Validation - Overdraft Protection");
        System.out.println("------------------------------------------");
        System.out.println("Current balance of Account 2: $" + String.format("%.2f", account2.getBalance()));
        System.out.println("Attempting to withdraw $1000.00 (more than balance):");
        account2.withdraw(1000.00);
        System.out.println("Attempting overdraft with description:");
        account2.withdraw(500.00, "Attempted overdraft");
        System.out.println();

        // Test 11: Validation Testing - Negative Withdrawals
        System.out.println("TEST 11: Validation - Negative Withdrawal");
        System.out.println("----------------------------------------");
        System.out.println("Attempting to withdraw -$25.00:");
        account3.withdraw(-25.00);
        System.out.println("Attempting negative withdrawal with description:");
        account3.withdraw(-75.00, "Invalid negative withdrawal");
        System.out.println();

        // Test 12: Edge Case - Zero Withdrawal
        System.out.println("TEST 12: Edge Case - Zero Withdrawal");
        System.out.println("------------------------------------");
        System.out.println("Attempting to withdraw $0.00:");
        account3.withdraw(0.00);
        System.out.println();

        // Test 13: Multiple Transactions Demonstration
        System.out.println("TEST 13: Multiple Transactions Demo");
        System.out.println("-----------------------------------");
        BankAccount demoAccount = new BankAccount("999888", "Demo User", 1500.00);
        System.out.println("Starting account:");
        demoAccount.displayAccountInfo();

        System.out.println("Performing multiple transactions:");
        demoAccount.deposit(200.00, "Bonus payment");
        demoAccount.withdraw(50.00, "Coffee shop");
        demoAccount.deposit(1000.00, "Freelance work");
        demoAccount.withdraw(300.00, "Rent payment");
        demoAccount.withdraw(25.00, "Gas");

        System.out.println("Final account status:");
        demoAccount.displayAccountInfo();

        // Test 14: Final Account Summary
        System.out.println("TEST 14: Final Account Summary");
        System.out.println("------------------------------");
        System.out.println("All accounts final status:");
        System.out.println("\nAccount 1 (Default Constructor):");
        account1.displayAccountInfo();

        System.out.println("Account 2 (Two-parameter Constructor):");
        account2.displayAccountInfo();

        System.out.println("Account 3 (Three-parameter Constructor):");
        account3.displayAccountInfo();

        System.out.println("Demo Account:");
        demoAccount.displayAccountInfo();

        System.out.println("=== ALL TESTS COMPLETED ===");
    }
}