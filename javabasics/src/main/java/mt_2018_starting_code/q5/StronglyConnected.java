package mt_2018_starting_code.q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//starting code
public class StronglyConnected {

    static HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();

    static boolean isStronglyConnected(int nodecount, int linkcount, ArrayList<Integer> l) {
        adjList.clear();
        for (int i = 0; i < l.size(); i += 2) {
            if (!adjList.containsKey(l.get(i))) {
                adjList.put(l.get(i), new ArrayList<>());
            }
            adjList.get(l.get(i)).add(l.get(i + 1));
        }
        System.out.println(adjList);

        int[] lowlink = new int[nodecount];
        Arrays.fill(lowlink, Integer.MAX_VALUE);
        int[] index = new int[nodecount];
        Arrays.fill(index, Integer.MAX_VALUE);

        for (int i = 0; i < nodecount; i++) {
            if (lowlink[i] == Integer.MAX_VALUE) {
                return tarjan(i, index, lowlink) == nodecount;
            }
        }

        return false;
    }

    static int counter = 0;
    static Stack<Integer> s = new Stack<>();

    static int tarjan(Integer node, int[] index, int[] lowlink) {
        index[node] = counter;
        lowlink[node] = counter;
        counter += 1;
        s.add(node);

        if (!adjList.containsKey(node)) return 0;
        for (Integer n: adjList.get(node)) {
            if (lowlink[n] == Integer.MAX_VALUE) {
                tarjan(n, index, lowlink);
                lowlink[node] = Math.min(lowlink[node], lowlink[n]);
            }
            else if (s.contains(n)) {
                lowlink[node] = Math.min(lowlink[node], index[n]);
            }
        }

        if (lowlink[node] == index[node]) {
            ArrayList<Integer> scc = new ArrayList<Integer>();
            while (true) {
                int n = s.pop();
                scc.add(n);
                if (n == node) {
                    break;
                }
            }
            return scc.size();
        }
        return -1;
    }

}


