package com.example.ps1a.week2;

public class Triangle extends GeometricObject {

    private double side1, side2, side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public String toString() {
        return String.format("Triangle: side1 = %s side2 = %s side3 = %s",
                side1, side2, side3);
    }

}
