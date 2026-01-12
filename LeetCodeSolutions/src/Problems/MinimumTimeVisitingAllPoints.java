package Problems;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;

        for(int i = 1; i < points.length; i++) {
            int horizantal = Math.abs(points[i][0] - points[i - 1][0]);
            int vertical = Math.abs(points[i][1] - points[i - 1][1]);

            ans += Math.max(horizantal, vertical);
        }    
        return ans;
    }
}
