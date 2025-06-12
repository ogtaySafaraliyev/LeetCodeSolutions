package Problems;

public class MinimumOperationsToMakeArrayEqual {
    public int minOperations(int n) {
        int minOperations = 0;

        for(int i=0;  i < n/2;  i++) {
            minOperations += n - ((2 * i) + 1);
        }

        return minOperations;
        
    }
}
