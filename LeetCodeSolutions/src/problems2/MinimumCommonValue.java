package problems2;
import java.util.*;

public class MinimumCommonValue {
    // public int getCommon(int[] nums1, int[] nums2) {
    //     int min = Math.min(nums1.length, nums2.length);

    //     if(min == nums2.length) {
    //         Set<Integer> set = new HashSet<>();
    //         for(int num: nums2) {
    //             set.add(num);
    //         }       

    //         for(int num: nums1) {
    //             if(set.contains(num)) {
    //                 return num;
    //             }
    //         }     
    //     }
    //     else {
    //         Set<Integer> set = new HashSet<>();
    //         for(int num: nums1) {
    //             set.add(num);
    //         }  
            
    //         for(int num: nums2) {
    //             if(set.contains(num)) {
    //                 return num;
    //             }
    //         }
    //     }
    //     return -1;       
        
    // }

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        for(;i < nums1.length && j < nums2.length;) {
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] > nums2[j]) j++;
            else i++;
        }
        return -1;
    }    
}
