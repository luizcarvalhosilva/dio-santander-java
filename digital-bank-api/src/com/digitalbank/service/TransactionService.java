package com.digitalbank.service;

import com.digitalbank.model.Account;
import com.digitalbank.model.Transaction;

import java.util.List;

public class TransactionService {

    public List<Transaction> getAccountTransactions(Account account) {
        return account.getTransactions();
    }
}
