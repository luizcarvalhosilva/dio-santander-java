package com.digitalbank.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected int accountNumber;
    protected double balance;
    protected Client client;
    protected List<Transaction> transactions;

    public Account(int accountNumber, Client client) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws Exception;

    protected void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printStatement() {
        System.out.println("=== Statement for account " + accountNumber + " ===");
        for (Transaction t : transactions) {
            System.out.println(t.getDateTime() + " - " + t.getType() + " - $" + t.getAmount());
        }
        System.out.println("Current Balance: $" + balance);
        System.out.println("=====================================");
    }
}
