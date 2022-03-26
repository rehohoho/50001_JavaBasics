package com.example.ps1a;

import com.example.ps1a.week1.AccountTest;
import com.example.ps1a.week2.CheckingAccountTest;
import com.example.ps1a.week2.LinearEquationTest;
import com.example.ps1a.week2.TestPset1;
import com.example.ps1a.week2.TriangleTest;

public class MyClass {
    public static void main(String[] args) {
//        FibonacciTest fibonacciTest = new FibonacciTest(new Integer[]{0, 1, 10});
//        IteratorWhileTest iteratorExamplesTest = new IteratorWhileTest(new Integer[]{0, 1, 10});
//        IteratorForEachTest iteratorForEachTest = new IteratorForEachTest(new Integer[]{0, 1, 10});
        AccountTest accountTest = new AccountTest(new Integer[]{0});
//        PrimeNumberTester primeNumberTester = new PrimeNumberTester(new Integer[]{1,2,3,4,5,6,7,8,9,10,57,101,111});
//        MyRectangle2DTester myRectangle2DTester = new MyRectangle2DTester(new Integer[][] {
//                {0,0,2,2,0,0,1,1,1,1}
//        });
        LinearEquationTest linearEquationTest = new LinearEquationTest(new Double[][] {
                {1.0, 2.0, 3.0, 5.0, 6.0, 7.0},
                {1.25, 2.0, 2.0, 4.2, 3.0, 6.0},
                {1.0, 2.0, 2.0, 4.0, 3.0, 6.0}
        });
        TriangleTest triangleTest = new TriangleTest(new Double[][]{{0.0}});
        CheckingAccountTest checkingAccountTest = new CheckingAccountTest(new Double[][]{{0.0}});
        TestPset1 testPset1 = new TestPset1(new String[]{"asdf"});
    }
}