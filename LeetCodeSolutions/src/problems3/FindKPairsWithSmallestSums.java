package problems3;
import java.util.*;

public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(elmnt -> elmnt[0]));

        for(int i = 0; i < Math.min(k, nums1.length); i++) {
            minHeap.offer(new int[] {nums1[i] + nums2[0],
                        i,
                        0});
        }

        List<List<Integer>> list = new ArrayList<>();

        while(!minHeap.isEmpty() && k > 0) {
            int[] currElmnt = minHeap.poll();
            int nums1Index = currElmnt[1];
            int nums2Index = currElmnt[2];

            k--;
            list.add(Arrays.asList(nums1[nums1Index], nums2[nums2Index]));

            if(nums2Index + 1 < nums2.length) {
                minHeap.offer(new int[] {
                        nums1[nums1Index] + nums2[nums2Index + 1],
                        nums1Index,
                        nums2Index + 1
                        });
            }
        }
        return list;
    }
}
