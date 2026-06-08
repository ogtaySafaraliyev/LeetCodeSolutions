package problems2;

public class SumMultiples {
	public int sumOfMultiples(int n) {
        int ans = 0;
        for(int i = 1; i < n + 1; i++) {
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                ans += i;
            }
        }
        return ans;
    }
}
