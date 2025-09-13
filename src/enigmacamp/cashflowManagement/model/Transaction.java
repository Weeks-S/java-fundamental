package com.enigmacamp.cashflowManagement.model;

import java.time.LocalDate;

public class Transaction {
    // FIELDS
    private String type; //income or outcome;
    private double amount;
    private String description;
    private LocalDate date;



    //CONSTRUCTOR
    public Transaction(String type, double amount, String description, LocalDate date) {
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public Transaction() {

    }

    //METHOD
    //Getter
    public String getType() {
        return "Type of Transaction" + type;
    }

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
    public void setType(String type) {
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
}
