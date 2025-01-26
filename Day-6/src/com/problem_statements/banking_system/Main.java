package com.problem_statements.banking_system;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("919896", "Ujjwal", 5000, 3.5);
        BankAccount currentAccount = new CurrentAccount("178373", "Gupta", 10000, 5000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println();
        }

        // Demonstrating loan functionality
        if (currentAccount instanceof Loanable) {
//            Loanable loanable = (Loanable) currentAccount; // interface reference and downcasting
//            loanable.applyForLoan(20000);
// same as above called belwo called upcasting and above downcasting
            ((CurrentAccount)currentAccount).applyForLoan(30000);

            System.out.println("Loan Eligibility :- " + ((CurrentAccount)currentAccount).calculateLoanEligibility());
        }
    }
}