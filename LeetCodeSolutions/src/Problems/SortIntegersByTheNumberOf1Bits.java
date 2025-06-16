package Problems;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {

        //     Arrays.sort(arr); // Sort initially to help with tie-breaking

        //     HashMap<Integer, Integer> bitCountMap = new HashMap<>();

        //     // Fill map with bit counts
        //     for (int num : arr) {
        //         bitCountMap.put(num, countOnes(num));
        //     }

        //     // Convert to Integer[] to use Comparator
        //     Integer[] ansArr = new Integer[arr.length];
        //     for (int i = 0; i < arr.length; i++) {
        //         ansArr[i] = arr[i];
        //     }

        //     // Sort by bit count, then by value
        //     Arrays.sort(ansArr, new Comparator<Integer>() {

        //         public int compare(Integer a, Integer b) {
        //             int countA = bitCountMap.get(a);
        //             int countB = bitCountMap.get(b);
        //             if (countA == countB) {
        //                 return a - b;
        //             }
        //             return countA - countB;
        //         }
        //     });

        //     // Convert back to int[]
        //     for (

        //             int i = 0; i < arr.length; i++) {
        //         arr[i] = ansArr[i];
        //     }

        //     return arr;
        // }

        // public int countOnes(int n) {
        //     int count = 0;
        //     while (n != 0) {
        //         count += n % 2;
        //         n = n / 2;
        //     }
        //     return count;
        // }

        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        Arrays.sort(nums, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int bitCountA = Integer.bitCount(a);
                int bitCountB = Integer.bitCount(b);
                if (bitCountA == bitCountB) {
                    return a - b;
                } else {
                    return bitCountA - bitCountB;
                }
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }

        return arr;
    }
}
