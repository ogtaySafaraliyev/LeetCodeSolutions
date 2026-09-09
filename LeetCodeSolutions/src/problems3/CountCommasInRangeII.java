package problems3;

public class CountCommasInRangeII {
	public long countCommas(long n) {
        long totalCommas = 0;
        for(long treshold = 1000; treshold <= n; treshold *= 1000) {
            totalCommas += n - treshold + 1; 
        }
        return totalCommas;
    }
}
