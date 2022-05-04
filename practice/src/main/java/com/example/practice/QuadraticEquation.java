package com.example.practice;

import java.util.Random;

public class QuadraticEquation {

    private Integer aMax;
    private Integer cMax;

    private QuadraticEquation(Integer aMax, Integer cMax) {
        this.aMax = aMax;
        this.cMax = cMax;
    }

    static class QuadraticCoefficient {
        private Integer a, b, c;

        public Integer getA() {
            return a;
        }

        public Integer getB() {
            return b;
        }

        public Integer getC() {
            return c;
        }

        @Override
        public String toString() {
            return String.format("y = %dx^2 + %dx + %d", a, b, c);
        }
    }

    public static QuadraticEquation getEquationGenerator(Integer aMax, Integer cMax) {
        return new QuadraticEquation(aMax, cMax);
    }

    public QuadraticCoefficient getTwoRoots() {
        Integer a = new Random().nextInt(aMax);
        Integer c = new Random().nextInt(cMax);

        // bound for b: b^2 - 4ac >= 0
        Integer bBound = (int) Math.ceil(Math.sqrt(4 * a * c));
        Integer b = new Random().nextInt(100 - bBound) + bBound;

        QuadraticCoefficient qc = new QuadraticCoefficient();
        qc.a = a;
        qc.b = b;
        qc.c = c;
        return qc;
    }
}

class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation qe = QuadraticEquation.getEquationGenerator(10, 10);
        System.out.println(qe.getTwoRoots());
    }
}