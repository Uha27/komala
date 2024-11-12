package com.uhaspringorm.komala;

public class ATM {
    private int pin;
    private String location;
    private String bankName;

    public ATM(int pin, String location, String bankName) {
        this.pin = pin;
        this.location = location;
        this.bankName = bankName;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void selectLanguage(String language) {
        System.out.println("Language selected: " + language);
    }

    public void displayOptions() {
        System.out.println("1. Withdraw\n2. Deposit\n3. Mini Statement\n4. Balance Inquiry");
    }
}
