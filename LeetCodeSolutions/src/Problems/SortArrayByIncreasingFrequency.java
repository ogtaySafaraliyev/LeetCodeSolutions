package Problems;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        int[] frequency = new int[201];
        List<Integer> ansList = new ArrayList<Integer>();

        for(int num: nums) {
            num = num + 100; 
            frequency[num]++;
            ansList.add(num);
        }

        ansList.sort((a, b) -> frequency[a] == frequency[b] ? b - a : frequency[a] - frequency[b]);

        int[] ans = new int[nums.length];
        int i = 0;
        for(int num: ansList) {
            ans[i++] = num - 100;
        }
        return ans;
    }
}
