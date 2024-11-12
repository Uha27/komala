package com.uhaspringorm.komala;

public class Komala {

    public static void main(String[] args) {
        // Create an ATM instance with Komala-specific details
        ATM atm = new ATM(1234, "Komala Street", "Bank of Komala");
        Customer customer = new Customer("Komala", 1234567890, "komala@example.com", "KOM123");
        Account account = new Account("987654", "Bank of Komala", 1000);
        
        // Simulate ATM functionality
        atm.displayOptions();
        atm.selectLanguage("English");

        // Customer actions
        customer.updateInformation("komala_updated@example.com");

        // Perform transactions
        account.deposit(500);
        account.printBalance();
        account.withdraw(200);
        account.printBalance();

        // Print a transaction receipt
        Transaction transaction = new Transaction("2024-11-12", "Deposit", 500);
        transaction.printReceipt();
        // Example code change for demonstration
        System.out.println("New feature added in feature-branch.");

    }
}
