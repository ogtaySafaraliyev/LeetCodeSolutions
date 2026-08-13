package problems3;

public class CheckIfItIsAGoodArray {
	public boolean isGoodArray(int[] nums) {
        int currGcd = 0;

        for(int num: nums) {
            currGcd = gcd(num, currGcd);
        }
        return currGcd == 1;
    }

    // not optimized version
    // private int gcd(int a, int b) {
    //     int max = 0;
    //     if(a > b) {
    //         max = a;
    //     }
    //     else {
    //         max = b;
    //     }

    //     for(int i = max; i > 1; i--) {
    //         if(a % i == 0 && b % i == 0) {
    //             return i;
    //         }
    //     }
    //     return 1;
    // }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;

        else
            return gcd(b, a % b);
    }

    //also not optimized
    // private int gcd(int a, int b) {
    //     if (b == 0)
    //         return a;

    //     else
    //         return gcd(b, Math.abs(a - b));
    // } 
}
