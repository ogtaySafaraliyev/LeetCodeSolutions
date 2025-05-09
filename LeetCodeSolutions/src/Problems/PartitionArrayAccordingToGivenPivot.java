package Problems;

public class PartitionArrayAccordingToGivenPivot {
	public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int i = 0, j = n - 1, left = 0, right = n - 1;
        int[] ans = new int[n];
        while (i < n) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }
            if (nums[j] > pivot) {
                ans[right--] = nums[j];
            }
            i++;
            j--;
        }
        while (left <= right) {
            ans[left++] = pivot;
        }
        return ans;

    }

    // public int[] pivotArray(int[] nums, int pivot) {
    //     int[] ansArr = new int[nums.length];
    //     int i = 0;

    //     for (int num : nums) {
    //         if (num < pivot) {
    //             ansArr[i++] = num;
    //         }
    //     }

    //     for (int num : nums) {
    //         if (num == pivot) {
    //             ansArr[i++] = num;
    //         }
    //     }

    //     for (int num : nums) {
    //         if (num > pivot) {
    //             ansArr[i++] = num;
    //         }
    //     }
    //     return ansArr;
    // }
}
