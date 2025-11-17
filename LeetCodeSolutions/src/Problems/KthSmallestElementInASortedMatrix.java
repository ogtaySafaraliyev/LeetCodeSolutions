package Problems;
import java.util.*;

public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> priorQue = new PriorityQueue<>();

        int row = matrix.length;
        int column = matrix[0].length;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                priorQue.offer(matrix[i][j]);
            }
        }

        int i = 1;
        while(i < k) {
            priorQue.poll();
            i++;
        }

        return priorQue.peek();
    }
}
