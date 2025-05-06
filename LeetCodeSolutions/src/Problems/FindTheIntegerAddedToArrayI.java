package Problems;

public class FindTheIntegerAddedToArrayI {
	// public int addedInteger(int[] nums1, int[] nums2) {
    //     Arrays.sort(nums1);
    //     Arrays.sort(nums2);
    //     return nums2[0] - nums1[0];
    // }

    public int addedInteger(int[] nums1, int[] nums2) {
        int minNum1 = nums1[0];
        int minNum2 = nums2[0];

        for(int i=0;  i<nums1.length;  i++) {
            minNum1 = Math.min(minNum1, nums1[i]);
            minNum2 = Math.min(minNum2, nums2[i]);
        }
        return minNum2 - minNum1;
    }
}
