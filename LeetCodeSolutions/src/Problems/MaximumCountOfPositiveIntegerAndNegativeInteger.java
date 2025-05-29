package Problems;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
	public int maximumCount(int[] nums) {
		// Find the number of 1's by subtracting the index of the first 1 from the array
		// length
		int countOfOnes = nums.length - firstOccurrence(nums, 1);
// Find the first occurrence index of 0, which is also the count of 0's
		int countOfZeros = firstOccurrence(nums, 0);

		return Math.max(countOfOnes, countOfZeros);
	}

	private int firstOccurrence(int[] nums, int x) {
		int left = 0;
		int right = nums.length;

		while (left < right) {
			int mid = (left + right) >> 1;

			if (nums[mid] >= x) {
				right = mid;
			} else {

				left = mid + 1;
			}
		}

		return left;
	}
}
