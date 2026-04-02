package Problems;
import java.util.*;

public class MinimumDeletionsToMakeArrayDivisible {
	class Solution {
	    public int minOperations(int[] nums, int[] numsDivide) {
	        int gcd = numsDivide[0];
	        for (int num : numsDivide) {
	            gcd = gcd(num, gcd);
	        }

	        Arrays.sort(nums);
	        for (int i = 0; i < nums.length; i++) {
	            if (gcd % nums[i] == 0) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    // Brute-force is not optimal 
//	     private int gcd(int a, int b) {
//	         int i;

//	         if (a < b)
//	             i = a;
//	         else
//	             i = b;

//	         for (i = i; i > 1; i--) {
//	             if (a % i == 0 && b % i == 0)
//	                 return i;
//	         }
//	         return 1;
//	     }

	    // Euclidean Algorithm
	    private int gcd(int a, int b) {

	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	}
}
