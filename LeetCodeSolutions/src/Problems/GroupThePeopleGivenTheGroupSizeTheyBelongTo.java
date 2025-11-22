package Problems;
import java.util.*;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> hshMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int person = 0;  person < groupSizes.length;  person++) {
            int size = groupSizes[person];
            hshMap.putIfAbsent(size, new ArrayList<>());
            hshMap.get(size).add(person);

            if(hshMap.get(size).size() == size) {
                result.add(new ArrayList<>(hshMap.get(size)));
                hshMap.get(size).clear();
            }
        }
        return result;
    }
}
