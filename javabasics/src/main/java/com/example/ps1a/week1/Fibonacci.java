package com.example.ps1a.week1;

public class Fibonacci {

    public static String fibonacci(int n) {
        if (n == 0) return "0";
        if (n == 1) return "0,1";

        StringBuilder fibSeqBuilder = new StringBuilder("0,1");
        int a = 0;
        int b = 1;
        int temp;

        for (int i = 2; i < n; i++) {
            temp = b;
            b = a + b;
            a = temp;
            fibSeqBuilder.append(String.format(",%s", b));
        }
        return fibSeqBuilder.toString();
    }

}
