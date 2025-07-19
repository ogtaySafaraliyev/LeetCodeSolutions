package Problems;

public class CountNumberOfMaximumBitwiseORSubsets {
	public int countMaxOrSubsets(int[] nums) {       
        int maxOr = 0;
        for(int num: nums) {
            maxOr |= num;
        }

        int n = nums.length;
        int totalSubset = 1 << n;
        int count = 0;
        
        for(int mask = 0; mask < totalSubset; mask++) {
            int innerOr = 0;
            for(int i=0;  i < n;  i++) {
                if((mask & (1 << i)) != 0) {
                    innerOr |= nums[i];
                } 
            }
            if(innerOr == maxOr) count++;
        }
        return count;
    }
}
