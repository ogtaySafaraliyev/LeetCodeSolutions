package Problems;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
	// tricky way
    // public int minimumOperations(int[] nums) {
    //     int count = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] % 3 != 0) {
    //             count++;
    //         }
    //     }
    //     return count;

    // }

    // legal method
    public int minimumOperations(int[] nums) {
        int count = 0;
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                num = nums[i] - 1;
                if (num % 3 == 0) {
                    count++;
                }

                else {
                    num = nums[i] + 1;
                    if (num % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
