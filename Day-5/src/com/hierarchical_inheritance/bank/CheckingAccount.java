package com.hierarchical_inheritance.bank;

public class CheckingAccount extends BankAccount{

    private double withdrawalLimit;

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }

}
