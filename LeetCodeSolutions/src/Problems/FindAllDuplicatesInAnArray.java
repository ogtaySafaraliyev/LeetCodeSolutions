package Problems;

import java.util.*;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> hshMap = new HashMap<>();
        ArrayList<Integer> listOfCounts = new ArrayList<Integer>();

        for(int number: nums) {
            hshMap.put(number, hshMap.getOrDefault(number, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: hshMap.entrySet()) {
            if(entry.getValue() == 2){
                listOfCounts.add(entry.getKey());
            }
        }
        return listOfCounts;

    }

    // check other methods without hashmap also such swapping
}
