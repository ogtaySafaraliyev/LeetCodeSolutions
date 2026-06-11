package problems2;
import java.util.*;

public class AllAncestorsOfANodeinADirectedAcyclicGraph {

    private int nodeCount;
    private List<Integer>[] adjacencyList;
    private List<List<Integer>> result;
    
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        this.nodeCount = n;

        adjacencyList = new List[n];      
        
        Arrays.setAll(adjacencyList, i -> new ArrayList<>());    

        for(int[] edge: edges) {
            int from = edge[0];
            int to = edge[1];

            adjacencyList[from].add(to);
        }

        result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            bfs(i);
        }

        return result;
    }

    private void bfs(int startNode) {

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(startNode);

        boolean[] visitedNodes = new boolean[nodeCount];
        visitedNodes[startNode] = true;

        while(!queue.isEmpty()) {
            int currentNode = queue.poll();

            for(int neighbor: adjacencyList[currentNode]) {
                if(!visitedNodes[neighbor]) {
                    visitedNodes[neighbor] = true;
                    queue.offer(neighbor);

                    result.get(neighbor).add(startNode);
                }
            }
        }
    }
}
