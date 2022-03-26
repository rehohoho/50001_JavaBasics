package com.example.ps1a.week2;

import com.example.ps1a.Tester;

public class CheckingAccountTest extends Tester<Double[]> {

    public CheckingAccountTest(Double[][] inputs) {
        super(inputs);
    }

    @Override
    public void run(Double[] input) {
        CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
        myCheckAcc.deposit(2000);
        myCheckAcc.withdraw(15000);

        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.deposit(7000);
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
    }

}
