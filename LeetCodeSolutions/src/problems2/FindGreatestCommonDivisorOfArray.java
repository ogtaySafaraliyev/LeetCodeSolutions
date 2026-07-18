package problems2;

public class FindGreatestCommonDivisorOfArray {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return getGCD(min, max);        
    }

    private int gcdOfTwo(int num1, int num2) {
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2;  i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private int getGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a == 0) ? b : a;
    }
}
