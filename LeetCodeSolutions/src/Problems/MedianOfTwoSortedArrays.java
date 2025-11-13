package Problems;
import java.util.*;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] myArr = new int[nums1.length + nums2.length];

        int i = 0;
        for(int num: nums1) {
            myArr[i++] = num;
        }

        for(int num: nums2) {
            myArr[i++] = num;
        }
        Arrays.sort(myArr);

        if (myArr.length % 2 == 1) {
            // odd length → single middle
            return myArr[myArr.length / 2];
        } else {
            // even length → average of two middles
            int mid1 = myArr[(myArr.length / 2) - 1];
            int mid2 = myArr[myArr.length / 2];
            return ((double) mid1 + (double) mid2) / 2.0;
        }        
    }
}
