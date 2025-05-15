package Problems;

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        // int mask = 0;

        // for(String binaryString: nums){
        //     int countOfOnes = 0;

        //     for(int i=0;  i<binaryString.length();  i++) {
        //         if(binaryString.charAt(i) == '1') {
        //             countOfOnes++;
        //         }
        //     }

        //     mask = mask | (1 << countOfOnes);
        // }

        // for(int i=0; ; i++) {
        //     if((mask >> i & 1) == 0) {
        //         String ones = "1".repeat(i);
        //         String zeros = "0".repeat(nums.length - i);
        //         return ones + zeros;
        //     }
        // }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(i) == '0') {
                str.append('1');
            } else {
                str.append('0');
            }
        }
        return str.toString();
    }

}
