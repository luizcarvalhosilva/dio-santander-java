package com.digitalbank;

import com.digitalbank.model.*;
import com.digitalbank.service.BankService;

public class Main {
    public static void main(String[] args) throws Exception {
        Client client1 = new Client("Alice", "12345678900");
        Client client2 = new Client("Bob", "98765432100");

        CheckingAccount checkingAccount = new CheckingAccount(1, client1, 500);
        SavingsAccount savingsAccount = new SavingsAccount(2, client2, 0.01);

        checkingAccount.deposit(1000);
        savingsAccount.deposit(2000);

        BankService bankService = new BankService();
        bankService.transfer(checkingAccount, savingsAccount, 300);

        // Aplicando juros na poupança
        savingsAccount.applyInterest();

        // Exibindo saldos
        System.out.println("Checking balance: " + checkingAccount.getBalance());
        System.out.println("Savings balance: " + savingsAccount.getBalance());

        // Extratos
        System.out.println();
        checkingAccount.printStatement();
        savingsAccount.printStatement();
    }
}
