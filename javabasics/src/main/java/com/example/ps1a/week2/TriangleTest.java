package com.example.ps1a.week2;

import com.example.ps1a.Tester;

public class TriangleTest extends Tester<Double[]> {

    public TriangleTest(Double[][] inputs) {
        super(inputs);
    }

    @Override
    public void run(Double[] input) {
        Triangle myTri = new Triangle();
        myTri.setColor("red");
        myTri.setFilled(true);
        System.out.println(myTri);
        System.out.println(myTri.isFilled());

        Triangle myTri2 = new Triangle(2.0, 4.0, 5.5);
        System.out.println(myTri2);
        System.out.println("area : " + myTri2.getArea() + " perimeter: " + myTri2.getPerimeter());
    }

}
