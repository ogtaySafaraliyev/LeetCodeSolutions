package Problems;
import java.util.*;

public class MinimumNumberOfVerticesToReachAllNodes {
    // public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    //     TreeSet<Integer> setOfVertices = new TreeSet<>();
    //     for(List<Integer> edge: edges) {
    //         setOfVertices.add(edge.get(1));
    //     }
        
    //     List<Integer> list = new ArrayList<>();
         
    //     for(int i = 0;  i < n;  i++) {
    //         if(!setOfVertices.contains(i)) {
    //             list.add(i);
    //         }
    //     }

    //     return list;        
    // }

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] count = new int[n];
        for(List<Integer> edge: edges) {
            count[edge.get(1)]++;
        }

        List<Integer> ansList = new ArrayList<>();

        for(int i = 0;  i < count.length;  i++) {
            if(count[i] == 0) {
                ansList.add(i);
            }
        }
        return ansList;
    }
}
