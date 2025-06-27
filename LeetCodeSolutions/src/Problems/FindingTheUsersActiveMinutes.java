package Problems;
import java.util.*;

public class FindingTheUsersActiveMinutes {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, Set<Integer>> hshMap = new HashMap<>();

        for(int[] log: logs) {
            int id = log[0];
            int time = log[1];

            if(!hshMap.containsKey(id)) {
                hshMap.put(id, new HashSet<Integer>());
            }

            hshMap.get(id).add(time);
        }

        int[] ansArr = new int[k];

        for(Set<Integer> value: hshMap.values()) {
            ansArr[value.size() - 1]++;
        } 
        return ansArr;   
    }
}
