package Problems;

public class DivideAnArrayIntoSubarraysWithMinimumCostI {
    public int minimumCost(int[] nums) {
        int firstNum = nums[0];        
        int secondNum = 50;
        int thirdNum = 50;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < secondNum) {
                thirdNum = secondNum;
                secondNum = nums[i];            
            }
            else if (nums[i] < thirdNum) {
                thirdNum = nums[i];                
            }            
        }
                
        return firstNum + secondNum + thirdNum;
    }
}
