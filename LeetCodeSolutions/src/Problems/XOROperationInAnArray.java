package Problems;

public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int j = 0;
        for(int i = start;  j < n;  i += 2) {
            ans ^= i;
            j++;
        }
        return ans;
    }
}
