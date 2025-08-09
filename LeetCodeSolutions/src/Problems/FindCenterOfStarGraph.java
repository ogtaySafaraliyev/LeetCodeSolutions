package Problems;
import java.util.*;

public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> hshMap = new HashMap<>();
        for(int[] edge: edges) {
            int node1 = edge[0];
            int node2 = edge[1];

            hshMap.put(node1, hshMap.getOrDefault(node1, 0) + 1);
            hshMap.put(node2, hshMap.getOrDefault(node2, 0) + 1);
        }
        int ans = 0;
        for(var element: hshMap.entrySet()) {
            int count = element.getValue();
            int node = element.getKey();
            if(count == edges.length) {
                ans = node; 
            }
        }
        return ans;    
    }
}
