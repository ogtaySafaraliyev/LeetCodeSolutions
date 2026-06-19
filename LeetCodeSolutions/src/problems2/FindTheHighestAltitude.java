package problems2;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];

        for(int i = 1; i < ans.length; i++) {
            ans[i] = gain[i-1] + ans[i] + ans[i-1];
        }

        int max = ans[0];
        for(int num: ans) {
            max = Math.max(max, num);
        }
        return max;
    }
}
