package com.uhaspringorm.komala;

public class Account {
    private String accountNumber;
    private String bankName;
    private int balance;

    public Account(String accountNumber, String bankName, int balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
