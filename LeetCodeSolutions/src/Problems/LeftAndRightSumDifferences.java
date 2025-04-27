package Problems;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];

        int[] ansArr = new int[nums.length];

        leftArr[0] = 0;        
        for(int i=1;  i<nums.length;  i++) {
            leftArr[i] = leftArr[i-1] + nums[i-1];           
        }

        rightArr[nums.length - 1] = 0;       
        for(int i=nums.length - 2;  i>=0;  i--) {            
            rightArr[i] = rightArr[i+1] + nums[i+1];
        }

        for(int i=0;  i<nums.length;  i++) {
            ansArr[i] = Math.abs(leftArr[i] - rightArr[i]);
        }
        return ansArr;        
    }
}
