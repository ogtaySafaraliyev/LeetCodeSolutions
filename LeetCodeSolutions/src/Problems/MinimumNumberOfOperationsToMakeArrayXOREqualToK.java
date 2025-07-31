package Problems;

public class MinimumNumberOfOperationsToMakeArrayXOREqualToK {
    // public int minOperations(int[] nums, int k) {
    //     for(int num: nums) {
    //         k ^= num;
    //     }
    //     return Integer.bitCount(k);    
    // }

    public int minOperations(int[] nums, int k) { 
        for(int num: nums) {
            k ^= num;
        }
        int count = 0;
        String str = Integer.toBinaryString(k);
        for(char ch: str.toCharArray()) {
            if(ch == '1') {
                count++;
            }
        }
        return count;
    }
}
