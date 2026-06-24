package problems2;

public class SmallestIndexWithDigitSumEqualToIndex {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int digitSum = digitSum(nums[i]);
            if(digitSum == i) {
                return i;
            }
        }
        return -1;        
    }

    private int digitSum(int num) {
        int digitSum = 0;
        while(num > 0) {
            digitSum = digitSum + num % 10; 
            num /= 10;
        }
        return digitSum;
    }
}
