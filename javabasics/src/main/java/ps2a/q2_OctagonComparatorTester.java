package ps2a;

import java.util.ArrayList;
import java.util.Collections;

public class q2_OctagonComparatorTester extends Tester<Integer[]>{

    public q2_OctagonComparatorTester(Integer[][] inputs) {
        super(inputs);
    }

    @Override
    public void run(Integer[] input) {
        ArrayList<q2_Octagon> l = new ArrayList<q2_Octagon>();
        for (Integer inp: input) {
            l.add(new q2_Octagon(inp));
        }
        Collections.sort(l, new q2_OctagonComparator());
        for (q2_Octagon o:l)
            System.out.println(o.getSide());
    }
}
