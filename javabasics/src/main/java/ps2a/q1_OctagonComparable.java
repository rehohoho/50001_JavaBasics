package ps2a;

public class q1_OctagonComparable implements Comparable<q1_OctagonComparable> {
    private double side;
    public q1_OctagonComparable(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public int compareTo(q1_OctagonComparable octagonComparable) {
        return (int) (this.side - octagonComparable.side);
    }
}
