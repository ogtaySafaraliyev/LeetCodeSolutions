package Problems;

import java.util.Arrays;

public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count = 0;

        for(int i=0;  i<costs.length; i++) {
            if(costs[i] > coins) {
                return count;
            }

            coins -= costs[i];
            count++;
        }
        return count;
    }
}
