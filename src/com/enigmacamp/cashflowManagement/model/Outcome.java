package com.enigmacamp.cashflowManagement.model;

import java.time.LocalDate;

public class Outcome extends Transaction{
    private final Priority priority;

    public enum Priority {
        High(3),
        Medium(2),
        Low(1);

        private final int level;

        Priority(int level) {
            this.level = level;
        }

        public int getLevel() {
            return level;
        }
    };

    public Outcome(double amount, String description, LocalDate date, Priority priority) {
        super(TransactionType.OUTCOME ,amount, description, date);
        this.priority = priority;

    }

    public Outcome(Transaction transaction, Priority priority) {
        super(TransactionType.OUTCOME, transaction.getAmount(), transaction.getDescription(), transaction.getDate());
        this.priority = priority;
    }

    @Override
    public double getImpactOnBalance() {
        return -getAmount();
    };

    @Override
    public String toString() {
        return "Outcome{" +
                "Rp."+ this.getAmount() +
                " priority=" + priority +
                '}';
    }


}
