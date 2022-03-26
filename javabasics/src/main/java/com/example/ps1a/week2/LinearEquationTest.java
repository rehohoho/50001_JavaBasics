package com.example.ps1a.week2;

import com.example.ps1a.Tester;

public class LinearEquationTest extends Tester<Double[]> {

    public LinearEquationTest(Double[][] inputs) {
        super(inputs);
    }

    @Override
    public void run(Double[] input) {
        LinearEquation equation = new LinearEquation(input[0], input[1], input[2], input[3], input[4], input[5]);
        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX() + " and y is " + equation.getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
    }
    
}
