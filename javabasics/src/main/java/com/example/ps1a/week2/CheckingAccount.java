package com.example.ps1a.week2;

import com.example.ps1a.week1.Account;

public class CheckingAccount extends Account {

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance) {
        this.setId(id);
        this.setBalance(balance);
    }

    @Override
    public void withdraw(double amt) {
        if (this.getBalance() - amt < -5000.0) {
            System.out.println("over limit");
            this.setBalance(-5000.0);
            return;
        }
        super.withdraw(amt);
    }

}
