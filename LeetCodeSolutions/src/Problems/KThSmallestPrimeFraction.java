package Problems;
import java.util.*;

public class KThSmallestPrimeFraction {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> priorQue = new PriorityQueue<>((a, b) -> Double.compare(a[0], b[0]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {                
                double fraction = (double)arr[i] / (double)arr[j];
                priorQue.offer(new double[] {fraction, arr[i], arr[j]});

            }
        }

        for(int i = 0;  i < k - 1;  i++) {
            priorQue.poll();
        }

        double[] result = priorQue.peek();

        return new int[] {(int)result[1], (int)result[2]};
    }
}
