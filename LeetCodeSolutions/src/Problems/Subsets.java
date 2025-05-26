package Problems;

import java.util.*;

public class Subsets {
	//Functional (Streams) approach
	
	// public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     result.add(new ArrayList<>());

    //     for (int num : nums) {
    //         result.addAll(
    //                 result.stream()
    //                         .map(subset -> {
    //                             List<Integer> newSubset = new ArrayList<>(subset);
    //                             newSubset.add(num);
    //                             return newSubset;
    //                         })
    //                         .toList());
    //     }

    //     return result;
    // }

	//Bitmasking approach
	
    // public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> subsetList = new ArrayList<>();
    //     int n = nums.length;
    //     int totalSubset = 1 << n;
    //     for(int mask=0;  mask < totalSubset;  mask++) {
    //         List<Integer> innerList = new ArrayList<>();
    //         for(int i=0;  i < n;  i++) {
    //             if((mask & (1 << i)) != 0) {
    //                 innerList.add(nums[i]);
    //             }
    //         }
    //         subsetList.add(innerList);
    //     }
    //     return subsetList;
    // }
	
	//with DFS approach
	
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        dfs(0, nums, new ArrayList<>(), result);
//        return result;
//    }
//
//    private static void dfs(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
//        result.add(new ArrayList<>(current));
//        for (int i = index; i < nums.length; i++) {
//            current.add(nums[i]);
//            dfs(i + 1, nums, current, result);
//            current.remove(current.size() - 1); // backtrack
//        }
//    }
}
