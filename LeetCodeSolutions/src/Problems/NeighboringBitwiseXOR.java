package Problems;

public class NeighboringBitwiseXOR {
	// tricky way
    // public boolean doesValidArrayExist(int[] derived) {
    //     int xorSum = 0;

    //     for(int i=0;  i<derived.length; i++) {
    //         xorSum = xorSum ^ derived[i];
    //     }

    //     return xorSum == 0;
    // }

    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int[] original = new int[n];

        for(int i=1;  i<n;  i++) {
            original[i] = original[i-1] ^ derived[i-1];
        }

        boolean isYeah = true;

        for(int i=0; i<n; i++) {
            int j = (i+1) % n;
            if(derived[i] != (original[i] ^ original[j])) {
                isYeah = false;
                break;
            }
        }
        return isYeah;
    }
}
