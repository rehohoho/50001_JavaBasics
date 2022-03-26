package com.example.ps1a.week1;

import com.example.ps1a.Tester;

public class AccountTest extends Tester<Integer> {

    public AccountTest(Integer[] inputs) {
        super(inputs);
    }

    @Override
    public void run(Integer input) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.printf("Monthly interest is %s, monthly rate is %s\n",
                account.getMonthlyInterest(), account.getMonthlyInterestRate());
    }

}
