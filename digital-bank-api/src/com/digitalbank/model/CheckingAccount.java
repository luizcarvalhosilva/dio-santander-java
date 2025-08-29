package com.digitalbank.model;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(int accountNumber, Client client, double overdraftLimit) {
        super(accountNumber, client);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction(new Transaction("DEPOSIT", amount));
        }
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            addTransaction(new Transaction("WITHDRAW", amount));
        } else {
            throw new Exception("Insufficient funds including overdraft limit.");
        }
    }
}