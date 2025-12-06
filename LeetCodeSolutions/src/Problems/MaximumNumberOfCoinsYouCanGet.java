package Problems;
import java.util.*;

public class MaximumNumberOfCoinsYouCanGet {
    public int maxCoins(int[] piles) {
        // [1, 2, 2, 4, 7, 8]  
        // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        Arrays.sort(piles);

        int ans = 0;
        for (int i = piles.length - 2; i >= piles.length / 3; i -= 2) {
            ans += piles[i];
            
        }
        return ans;        
    }
}
