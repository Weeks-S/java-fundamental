package com.enigmacamp.cashflowManagement.model;

import java.time.LocalDate;
import java.util.Objects;

abstract public class Transaction {
    // FIELDS
    private TransactionType type; //income or outcome;
    private double amount;
    private String description;
    private LocalDate date;


    protected enum TransactionType {
        INCOME("Income"),
        OUTCOME("Outcome");

        public String displayName ;

        TransactionType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }
    }

    //CONSTRUCTOR
    protected Transaction(double amount, String description, LocalDate date) {
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    protected Transaction(
            TransactionType type,
            double amount,
            String description,
            LocalDate date)
    {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    protected Transaction() {
    }

    //METHOD

    public abstract double getImpactOnBalance();
    //Getter

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    //Setter
    public void setType(TransactionType type) {
        this.type = type;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    //OVERRIDE toString()
    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(amount, that.amount) == 0 && type == that.type && Objects.equals(description, that.description) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, amount, description, date);
    }

}
