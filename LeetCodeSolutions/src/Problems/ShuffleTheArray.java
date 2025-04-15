package Problems;
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int pointOne = 0;
        int pointTwo = 0;

        while(pointOne < nums.length/2) {
            ans[pointTwo] = nums[pointOne];
            ans[pointTwo + 1] = nums[pointOne + (nums.length/2)];
            pointTwo = pointTwo + 2;

            pointOne++;
        }
        return ans;

    }

}
