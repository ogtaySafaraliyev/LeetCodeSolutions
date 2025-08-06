package Problems;

public class FindIfArrayCanBeSorted {
    public boolean canSortArray(int[] nums) {

        boolean isYeah = true;

        for(int i = 0; i < nums.length;  i++) {

            for(int j = 1; j < nums.length - i;  j++) {
                
                if(nums[j - 1] > nums[j]) {
                    int bitCountOfFirst = Integer.bitCount(nums[j-1]);
                    int bitCountOfSecond = Integer.bitCount(nums[j]);

                    if(bitCountOfFirst == bitCountOfSecond) {
                        int temp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = temp;
                    }

                    else if(bitCountOfFirst != bitCountOfSecond) {
                        isYeah = false;
                        break; 
                    }

                }
            }
        }
        return isYeah;
    }    
}
