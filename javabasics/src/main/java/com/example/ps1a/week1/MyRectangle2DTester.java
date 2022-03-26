package com.example.ps1a.week1;

import com.example.ps1a.Tester;

public class MyRectangle2DTester extends Tester<Integer[]> {

    public MyRectangle2DTester(Integer[][] inputs) {
        super(inputs);
    }

    @Override
    public void run(Integer[] input) {
        MyRectangle2D r = new MyRectangle2D();
        r.setX(input[0]);
        r.setY(input[1]);
        r.setHeight(input[2]);
        r.setWidth(input[3]);

        // Test get, set, composite gets
        System.out.printf("X: %s Y: %s W: %s H: %s Area %s Perimter %s%n",
                r.getX(), r.getY(), r.getWidth(), r.getHeight(), r.getArea(), r.getPerimeter());

        // Test other constructor, contain, overlap rectangles
        MyRectangle2D r2 = new MyRectangle2D(input[4], input[5], input[6], input[7]);
        System.out.printf("X: %s Y: %s W: %s H: %s Area %s Perimter %s%n",
                r2.getX(), r2.getY(), r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
        System.out.printf("Contains: %s, Overlaps %s\n",
                r.contains(r2), r.overlaps(r2));

        // Test contain point
        System.out.printf("Point: %s, %s, Contains point: %s",
                input[8], input[9], r.contains(input[8], input[9]));
    }

}
