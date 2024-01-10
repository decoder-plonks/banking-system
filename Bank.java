// Bank.java
package com.example.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating and adding accounts
        Account acc1 = new Account(1001, "John Doe", 5000.0);
        Account acc2 = new Account(1002, "Jane Doe", 7500.0);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Displaying accounts
        System.out.println("Accounts in the bank:");
        bank.displayAccounts();
    }
}
