package problems2;
import java.util.*;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> prQue = new PriorityQueue<>((a, b) -> Double.compare(a[2], b[2]));

        for(int[] point: points) {
            double distance = Math.hypot(point[0], point[1]);
            prQue.offer(new double[] {point[0], point[1], distance});
        }

        int[][] ans = new int[k][2];

        for(int i = 0; i < k; i++) {
            double[] arr = prQue.poll();
            ans[i][0] = (int) (arr[0]);
            ans[i][1] = (int) (arr[1]);
        }
        
        return ans;
    }
}
