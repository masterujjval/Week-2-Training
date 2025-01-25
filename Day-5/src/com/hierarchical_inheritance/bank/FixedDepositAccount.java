package com.hierarchical_inheritance.bank;

public class FixedDepositAccount extends BankAccount{

    private int depositTerm; // Term in years

    // Constructor for FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance); // Call the superclass constructor
        this.depositTerm = depositTerm;
    }

    // Method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        super.displayAccountDetails();
        System.out.println("Deposit Term: " + depositTerm + " years");
    }

}
