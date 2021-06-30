package com.hillel.lesson04.homework.services;

import com.hillel.lesson04.homework.entities.Client;
import com.hillel.lesson04.homework.utils.HelperClass;

public class TransactionService {
    public void moneySend(Client client, String accountId) {
        HelperClass helperClass = new HelperClass();
        helperClass.transactionUserChecker(client.getAccountId(), accountId);
    }
}
