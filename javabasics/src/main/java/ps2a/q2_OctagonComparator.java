package ps2a;

import java.util.Comparator;

public class q2_OctagonComparator implements Comparator<q2_Octagon> {
    @Override
    public int compare(q2_Octagon octagon, q2_Octagon t1) {
        return (int) (octagon.getSide() - t1.getSide());
    }
}
