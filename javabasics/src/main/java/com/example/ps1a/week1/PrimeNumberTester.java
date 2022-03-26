package com.example.ps1a.week1;

import com.example.ps1a.Tester;

public class PrimeNumberTester extends Tester<Integer> {

    public PrimeNumberTester(Integer[] inputs) {
        super(inputs);
    }

    @Override
    public void run(Integer input) {
        int isPrime = PrimeNumberChecker.isPrime(input);
        System.out.println(input + " is a prime: " + isPrime);
    }
}
