package com.enigmacamp.cashflowManagement.service;

import com.enigmacamp.cashflowManagement.model.Outcome;
import com.enigmacamp.cashflowManagement.model.Transaction;

import java.time.LocalDate;

public class CashflowManager {
    public static void main(String[] args) {
//        Transaction user1 = new Transaction();
//        System.out.println("(Before) User 1 = " + user1);
//
//        Outcome outcome = new Outcome(user1, Outcome.Priority.High);
//        System.out.println("(After) User 1 = " + user1);


        Outcome Hospital = new Outcome(2_500_000, "Hospital Bill", LocalDate.of(2025,8,1), Outcome.Priority.High);



    }
}
