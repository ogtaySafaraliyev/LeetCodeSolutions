package Problems;

public class TransformArrayByParity {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        // Arrays.sort(nums);
        bubbleSort(nums);
        return nums;

    }

    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {                
                if(nums[j-1] > nums[j]) {
                    int temp = nums[j-1]; 
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }        
    }

}
