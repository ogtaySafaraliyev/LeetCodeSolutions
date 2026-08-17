package problems3;
import java.util.*;

public class SumOfDistancesInTree {
	List<List<Integer>> graph;
    int[] count, res;
    int n;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        this.n = n;
        graph = new ArrayList<>();
        count = new int[n];
        res = new int[n];
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        postOrder(0, -1);
        preOrder(0, -1);
        return res;
    }

    void postOrder(int node, int parent) {
        count[node] = 1;
        for (int child : graph.get(node)) {
            if (child == parent) continue;
            postOrder(child, node);
            count[node] += count[child];
            res[0] += res[child] + count[child];
        }
    }

    void preOrder(int node, int parent) {
        for (int child : graph.get(node)) {
            if (child == parent) continue;
            res[child] = res[node] - count[child] + (n - count[child]);
            preOrder(child, node);
        }
    }
}
