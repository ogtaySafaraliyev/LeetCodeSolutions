package Problems;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0, j=nums.length;  i<nums.length && j<nums.length*2;  i++, j++) {
            ans[i] = nums[i];
            ans[j] = nums[i];
        }
        return ans;
    }
}
