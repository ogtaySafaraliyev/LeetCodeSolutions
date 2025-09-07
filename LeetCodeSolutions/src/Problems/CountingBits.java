package Problems;

public class CountingBits {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i = 0; i <= n;  i++) {
            int count = Integer.bitCount(i);
            arr[i] = count;
        }
        return arr;
    }
}
