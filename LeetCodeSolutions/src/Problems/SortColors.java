package Problems;

public class SortColors {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length;  i++) {
            for(int j=1;  j<nums.length - i; j++) {
                if(nums[j-1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
