package Problems;

public class FindTriangularSumOfAnArray {
	public int triangularSum(int[] nums) {
        for(int i=nums.length;  i>0;  i--) {
            for(int j=0;  j<i-1;  j++) {
                nums[j] = (nums[j] + nums[j+1]) % 10;
            }
        }
        return nums[0];
    }
}
