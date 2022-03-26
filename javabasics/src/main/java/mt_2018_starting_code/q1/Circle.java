package mt_2018_starting_code.q1;

public class Circle {
    private double x;
    private double y;
    private double radius;

    Circle() {
        x = 0;
        y = 0;
        radius = 1;
    }

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public boolean contains(double px, double py) {
        return x - radius <= px && px <= x + radius &&
                y - radius <= py && py <= y + radius;
    }

    public boolean contains(Circle c) {
        double ctrDiff = Math.sqrt((c.getX() - x) * (c.getX() - x) +
                (c.getY() - y) * (c.getY() - y));
        return ctrDiff + c.getRadius() <= radius;
    }

    public boolean overlaps(Circle c) {
        double ctrDiff = Math.sqrt((c.getX() - x) * (c.getX() - x) +
                (c.getY() - y) * (c.getY() - y));
        return c.radius + radius >= ctrDiff;
    }
}
