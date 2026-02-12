package Problems;

public class FindTheSmallestDivisorGivenAThreshold {
	public int smallestDivisor(int[] nums, int threshold) {
        int maxNum = 0;
        for(int num: nums) {
            maxNum = Math.max(num, maxNum);
        }

        int left = 1;
        int right = maxNum;
        int mid = (left + right) / 2;
        int ans = -1;

        while(left <= right) {
            int sum = 0;

            for(int i = 0; i < nums.length; i++) {
                sum += (int) Math.ceil((double) nums[i] / mid);
            }

            if(sum <= threshold) {
                right = mid - 1;
                ans = mid;
            }
            else{                
                left = mid + 1;
            }

            mid = (left + right) / 2;
        }
        return ans;
    }
}
