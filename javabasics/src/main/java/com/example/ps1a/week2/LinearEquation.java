package com.example.ps1a.week2;

/**
 * a b | e
 * c d | f
 *
 * 1 b/a    | e/a
 * 0 d-cb/a | f - ce/a
 * y = (f-ce/a) / (d-cb/a)
 * x + by/a = e/a
 * x = e/a - by/a
 */
public class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (Math.abs(a*d - b*c) > 1e-7);
    }

    public double getX() {
        return e / a - b * getY() / a;
    }

    public double getY() {
        return (f - c * e / a) / (d - c * b / a);
    }
}
