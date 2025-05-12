package Problems;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] prefOddCount = new int[nums.length + 1];
        prefOddCount[0] = 1;
        int ans = 0;
        int currentOdd = 0;

        for(int num: nums) {
            currentOdd += num & 1;

            if(currentOdd - k >= 0) {
                ans += prefOddCount[currentOdd - k];
            }
            prefOddCount[currentOdd]++;
        }
        return ans;

    }
}
