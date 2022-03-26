package ps2a;

import java.util.ArrayList;
import java.util.Collections;

public class q1_OctagonComparableTester extends Tester<Integer[]>{

    public q1_OctagonComparableTester(Integer[][] inputs) {
        super(inputs);
    }

    @Override
    public void run(Integer[] input) {
        ArrayList<q1_OctagonComparable> l = new ArrayList<q1_OctagonComparable>();
        for (Integer inp: input) {
            l.add(new q1_OctagonComparable(inp));
        }
        Collections.sort(l);
        for (q1_OctagonComparable o:l)
            System.out.println(o.getSide());
    }
}
