package problems3;

public class MaximumDistanceBetweenAPairOfValues {
	public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0, m = nums2.length;
        for (int i = 0; i < nums1.length && i < m; i++) {
            int lo = i, hi = m - 1, best = -1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums2[mid] >= nums1[i]) {
                    best = mid;
                    lo = mid + 1;
                } else
                    hi = mid - 1;
            }
            if (best != -1)
                ans = Math.max(ans, best - i);
        }
        return ans;
    }
}
