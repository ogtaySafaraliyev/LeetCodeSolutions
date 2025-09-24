package Problems;
import java.util.*;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while(!seen.contains(n) && n != 1) {
            seen.add(n);
            n = helperMethod(n);
        }
        return n == 1;
        
    }

    private int helperMethod(int n) {
        int sum = 0;
        while(n > 0) {
            int reminder = n % 10;
            sum += Math.pow(reminder, 2);
            
            n /= 10;
        }
        return sum;
    }
}
