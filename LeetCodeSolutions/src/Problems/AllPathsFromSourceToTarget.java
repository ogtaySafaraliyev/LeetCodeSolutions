package Problems;
import java.util.*;

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(graph, 0, path, paths);
        return paths;
    }

    private void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> paths) {
        path.add(node);

        if(node == graph.length - 1) {
            paths.add(new ArrayList<>(path));
        }
        else {
            for(int next: graph[node]) {
                dfs(graph, next, path, paths);
            }
        }

        path.remove(path.size() - 1);
    }
}
