package com.hierarchical_inheritance.bank;

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("12345", 5000.0, 3.5);
        savingsAccount.displayAccountType();
        System.out.println();

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("67890", 3000.0, 1000.0);
        checkingAccount.displayAccountType();
        System.out.println();

        // Create a FixedDepositAccount object
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("11223", 10000.0, 5);
        fixedDepositAccount.displayAccountType();
    }

}
