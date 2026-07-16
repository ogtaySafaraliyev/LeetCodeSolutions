package problems2;
import java.util.*;

public class SumOfGCDOfFormedPairs {
	public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] mx = new int[n];
        int max = nums[0];

        for(int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            mx[i] = max;
        }

        int[] prefixGcd = new int[n];

        for(int i = 0; i < n; i++) {
            prefixGcd[i] = getGCD(mx[i], nums[i]);
        }       

        return helperMethod(prefixGcd);
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

    private long helperMethod(int[] prefixGcd) {
        Arrays.sort(prefixGcd);

        long sum = 0L;
        int left = 0;
        int right = prefixGcd.length - 1;

        while(left < right) {
            sum += getGCD(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
        return sum;
    }
}
