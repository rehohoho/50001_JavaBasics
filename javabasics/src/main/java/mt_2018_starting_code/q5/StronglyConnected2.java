package mt_2018_starting_code.q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//starting code
public class StronglyConnected2 {

    static HashMap<Integer, ArrayList<Integer>> adjList = new HashMap();

    static boolean isStronglyConnected(int nodecount, int linkcount, ArrayList<Integer> l) {
        adjList.clear();
        for (int i = 0; i < l.size(); i += 2) {
            if (!adjList.containsKey(l.get(i))) {
                adjList.put(l.get(i), new ArrayList());
            }
            adjList.get(l.get(i)).add(l.get(i + 1));
        }
        int[] visited = new int[nodecount];
        Arrays.fill(visited, 0);
        dfs(0, visited);
        System.out.println(adjList);
        System.out.println(Arrays.stream(visited).sum());
        return Arrays.stream(visited).sum() == nodecount;
    }

    static void dfs(int node, int[] visited) {
        if (!adjList.containsKey(node)) return;
        for (Integer n: adjList.get(node)) {
            if (visited[n] == 0) {
                visited[n] = 1;
                dfs(n, visited);
            }
        }
    }

}


