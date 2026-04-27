package problems2;
import java.util.*;

public class CountTheNumberOfCompleteComponents {
    public int countCompleteComponents(int n, int[][] edges) {
// creating graph
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);            
        }
//BFS algorithm
        boolean[] visited = new boolean[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                visited[i] = true;

                int nodes = 0;
                int edgeSum = 0;

                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    nodes++;
                    edgeSum += graph.get(cur).size();

                    for (int nei : graph.get(cur)) {
                        if (!visited[nei]) {
                            visited[nei] = true;
                            queue.offer(nei);
                        }
                    }
                }

                int edgesCount = edgeSum / 2;

                if (edgesCount == nodes * (nodes - 1) / 2) {
                    result++;
                }
            }
        }
        return result;
    }
}
