package com.hierarchical_inheritance.bank;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

}
