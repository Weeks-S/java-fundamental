package com.enigmacamp.cashflowManagement.service;

import com.enigmacamp.cashflowManagement.model.Transaction;

import java.time.LocalDate;

public class CashflowManager {
    public static void main(String[] args) {
        Transaction transactionUser1 = new Transaction();
        System.out.println("(Before) User 1 = " + transactionUser1);
        transactionUser1.setType("Income");
        transactionUser1.setAmount(5_000_000);
        transactionUser1.setDescription("Gajian");
        transactionUser1.setDate(LocalDate.of(2025, 8, 1));
        System.out.println("(After) User 1 = " + transactionUser1);
    }
}
