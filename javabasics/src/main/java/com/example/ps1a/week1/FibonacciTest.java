package com.example.ps1a.week1;

import com.example.ps1a.Tester;

public class FibonacciTest extends Tester<Integer> {

    public FibonacciTest(Integer[] inputs) {
        super(inputs);
    }

    @Override
    public void run(Integer input) {
        String ans = "";
        Fibonacci fibo = new Fibonacci();
        ans = fibo.fibonacci(input);
        System.out.println(ans);
    }

}