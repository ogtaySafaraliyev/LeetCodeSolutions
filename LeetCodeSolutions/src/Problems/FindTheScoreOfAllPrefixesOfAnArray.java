package Problems;

public class FindTheScoreOfAllPrefixesOfAnArray {
	public long[] findPrefixScore(int[] nums) {
        long[] prefArr = new long[nums.length];
        int max = 0;

        for(int i = 0;  i < nums.length;  i++) {
            max = Math.max(max, nums[i]);

            int conValue = nums[i] + max;

            if(i == 0) {
                prefArr[i] = conValue;
            }
            else {
                prefArr[i] = prefArr[i-1] + conValue;
            }
        }
        return prefArr;
    }
}
