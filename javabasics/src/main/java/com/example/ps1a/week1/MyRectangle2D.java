package com.example.ps1a.week1;

public class MyRectangle2D {

    private double x, y, width, height;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle2D() {
        x = 0;
        y = 0;
        height = 1;
        width = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    private boolean contains1D(double val, double center, double length) {
        return (val >= center - length / 2 &&
                val <= center + length / 2);
    }

    public boolean contains(double x, double y) {
        return (contains1D(x, this.x, width) &&
                contains1D(y, this.y, height));
    }

    public boolean contains(MyRectangle2D r) {
        return (r.x - r.width / 2 >= x - width / 2 &&
                r.x + r.width / 2 <= x + width / 2 &&
                r.y - r.height / 2 >= y - width / 2 &&
                r.y + r.height / 2 <= y + width / 2);
    }

    public boolean overlaps(MyRectangle2D r) {
        boolean isHorizontallyOverlapping = (contains1D(r.x - r.width / 2, x, width) ||
                                             contains1D(r.x + r.width / 2, x, width));
        boolean isVerticallyOverlapping = (contains1D(r.y - r.height / 2, y, height) ||
                                           contains1D(r.y + r.height / 2, y, height));
        return isHorizontallyOverlapping && isVerticallyOverlapping;
    }

}
