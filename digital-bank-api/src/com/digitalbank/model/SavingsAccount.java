package com.digitalbank.model;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accountNumber, Client client, double interestRate) {
        super(accountNumber, client);
        this.interestRate = interestRate;
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
        if (amount <= balance) {
            balance -= amount;
            addTransaction(new Transaction("WITHDRAW", amount));
        } else {
            throw new Exception("Insufficient funds.");
        }
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        addTransaction(new Transaction("INTEREST", interest));
    }
}
