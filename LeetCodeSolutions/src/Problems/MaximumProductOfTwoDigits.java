package Problems;

import java.util.*;

public class MaximumProductOfTwoDigits {
	public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();

        while(n > 0) {
            int lastDigit = n % 10;
            list.add(lastDigit);
            n /= 10;
        }
        
        int ans = 0;
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1;  j<list.size();  j++) {
                int product = list.get(i) * list.get(j);
                ans = Math.max(product, ans);
            }
            
        }
        return ans;
    }
}
