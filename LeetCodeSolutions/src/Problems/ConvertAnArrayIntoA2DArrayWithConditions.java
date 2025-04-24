package Problems;

import java.util.*;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();

        int[] count = new int[nums.length + 1];

        for(int num: nums) {
            count[num]++;
        }

        for(int number=1; number <= nums.length; number++) {
            int frequency = count[number];
            for(int i=0;  i<frequency;  i++) {
                if(ansList.size() <= i) {
                    ansList.add(new ArrayList<>());
                }
                ansList.get(i).add(number);

            }
        }
        return ansList;       
    }
}
