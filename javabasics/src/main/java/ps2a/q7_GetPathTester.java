package ps2a;

import java.util.ArrayList;

public class q7_GetPathTester extends Tester<int[][]> {

    public q7_GetPathTester(int[][][] inputs) {
        super(inputs);
    }

    @Override
    public void run(int[][] input) {
        ArrayList<Point> path = new ArrayList<>();
        boolean success = q7_GetPath.getPath(3,2, path, input);
        System.out.println(success);
        if (success)
            System.out.println(path);
        path.clear();
    }
}
