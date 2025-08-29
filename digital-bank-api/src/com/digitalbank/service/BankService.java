package com.digitalbank.service;

import com.digitalbank.model.Account;
import com.digitalbank.model.Transaction;

public class BankService {

    public void transfer(Account from, Account to, double amount) throws Exception {
        from.withdraw(amount);
        to.deposit(amount);
        from.getTransactions().add(new Transaction("TRANSFER_OUT", amount));
        to.getTransactions().add(new Transaction("TRANSFER_IN", amount));
    }
}
