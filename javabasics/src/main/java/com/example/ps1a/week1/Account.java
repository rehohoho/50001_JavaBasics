package com.example.ps1a.week1;

import java.time.Instant;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0.0;
        dateCreated = Date.from(Instant.now());
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = Date.from(Instant.now());
    }

    // Accessor methods
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Mutator methods
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double v) {
        annualInterestRate = v;
    }

    // other methods
    public double getMonthlyInterest() {
        return balance * annualInterestRate / 100 / 12;
    }

    public double getMonthlyInterestRate() {
        return 100 * getMonthlyInterest() / balance;
    }

    public void withdraw(double amt) {
        this.balance -= amt;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }

}
