package Problems;

public class TheTwoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        int[] count = new int[102];
        int[] ans = new int[2];

        int j=0;
        for(int i=0;  i<nums.length;  i++) {
            count[nums[i]]++;
            
            if(count[nums[i]] == 2) {
                ans[j++] = nums[i];
            }
        }

        return ans;
    }
}
