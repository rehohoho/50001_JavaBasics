package ps2a;

import java.util.ArrayList;

public class q7_GetPath {

    //Fill in your answer for this method
    public static boolean getPath (int r,
                                   int c,
                                   ArrayList<Point> path,
                                   final int [][] grid) {
        path.add(new Point(0,0));
        return getPathDriver(0, 0, r, c, path, grid);
    }

    private static boolean getPathDriver(int x, int y,
                                         int gx, int gy,
                                         ArrayList<Point> path,
                                         final int[][] grid) {
        if (x == gx && y == gy) {
            return true;
        }
        if (x + 1 <= gx && y <= gy && grid[x+1][y] == 0) {
            path.add(new Point(x + 1, y));
            if (getPathDriver(x + 1, y, gx, gy, path, grid)) {
                return true;
            }
            path.remove(path.size() - 1);
        }
        if (x <= gx && y + 1 <= gy && grid[x][y+1] == 0) {
            path.add(new Point(x, y+1));
            if (getPathDriver(x, y + 1, gx, gy, path, grid)) {
                return true;
            }
            path.remove(path.size() - 1);
        }
        return false;
    }
}

//You do not need to change any code below ---------
class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
//--------------------------------------------------

/* HINT:
Your solution ought to work with a grid that is not square.
Here is the grid for Test Case 8:

            final int[][] grid = {
                    {0,0,0,1},
                    {0,1,0,0},
                    {0,1,1,1},
                    {0,0,0,1},
                    {1,1,0,0},
                    {1,1,1,0}
            };

If the destination is r = 5, c = 3, then getPath() returns true.
If the destination is r = 2, c = 3, then getPath() returns false.

*/