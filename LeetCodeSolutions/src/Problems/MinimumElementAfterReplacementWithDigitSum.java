package Problems;

public class MinimumElementAfterReplacementWithDigitSum {
	public int minElement(int[] nums) {
        int min = nums[0];
        for(int i = 0;  i < nums.length;   i++) {
            int newNum = helperMethod(nums[i]);
            nums[i] = newNum;
            min = Math.min(min, newNum);
        }
        return min;
    }

    private int helperMethod(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
