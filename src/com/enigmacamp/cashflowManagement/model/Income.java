package com.enigmacamp.cashflowManagement.model;

import java.time.LocalDate;

public class Income extends Transaction {
    private boolean isRecurring;
    private RecurrenceFreq freq;

    public enum RecurrenceFreq {
        DAILY,
        WEEKLY,
        MONTHLY,
        YEARLY,
        ONE_TIME
    }

    public Income(double amount, String description, LocalDate date, boolean isRecurring, RecurrenceFreq freq) {
        super(TransactionType.INCOME, amount, description, date);
        this.isRecurring = isRecurring;
        this.freq = freq;
    }


    public Income(Transaction transaction, boolean isRecurring, RecurrenceFreq freq) {
        super(TransactionType.INCOME ,transaction.getAmount(), transaction.getDescription(), transaction.getDate());
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public RecurrenceFreq getRecurrenceFreq() {
        return freq;
    }

    public void setRecurring(boolean isRecurring) {
        this.isRecurring = isRecurring;
    }

    public void setRecurrenceFreq(RecurrenceFreq freq) {
        this.freq = freq;
    }


    @Override
    public double getImpactOnBalance() {
        return getAmount();
    };
    @Override
    public String toString() {
        return "Income{" +
                "isRecurring=" + isRecurring +
                ", freq=" + freq +
                '}';
    }
}
