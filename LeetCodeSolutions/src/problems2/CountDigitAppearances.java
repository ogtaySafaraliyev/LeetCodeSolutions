package problems2;

public class CountDigitAppearances {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];

            while(num > 0) {
                int dgt = num % 10;
                if(dgt == digit) {
                    count++;
                }                
                num /= 10;
            } 
        }
        return count;
    }
}
