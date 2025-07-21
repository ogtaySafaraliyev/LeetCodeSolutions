package Problems;
import java.util.*;

public class MaxSumOfAPairWithEqualSumOfDigits {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> hshMap = new HashMap<>();
        int ans = -1;
        for(int num: nums) {
            int digitSum = sumOfDigits(num);
            if(hshMap.containsKey(digitSum)) {
                ans = Math.max(ans, hshMap.get(digitSum) + num);
            }
            
            hshMap.put(digitSum, Math.max(num, hshMap.getOrDefault(digitSum, 0)));
        }
        return ans;

    }

    private int sumOfDigits(int number) {
        int sum = 0;
        while(number > 0) {            
            sum += number % 10;;
            number /= 10;
        }
        return sum;
    }
}
