package Problems;

public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
        int point1 = 0;

        for(int point2 = 0;  point2 < nums.length;   point2++) {
            if(point1 < 2 || nums[point2] != nums[point1 - 2]) {
                nums[point1] = nums[point2];
                point1++;
            }
        }
        return point1;
    }
}
