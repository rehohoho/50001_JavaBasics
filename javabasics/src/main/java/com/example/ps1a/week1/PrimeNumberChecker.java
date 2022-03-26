package com.example.ps1a.week1;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class PrimeNumberChecker {
    public static int isPrime(int num){
        if (num < 2) return 0;

        for (int i = 2; i < round(sqrt(num)) + 1; i++) {
            // divisible means not prime
            if (num % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
