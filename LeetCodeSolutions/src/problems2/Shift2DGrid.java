package problems2;
import java.util.*;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                queue.offer(grid[i][j]);
            }
        }

        int total = cols * rows;
        k = k % total;

        for(int i = 0; i < k; i++) {
            int num = queue.pollLast();
            queue.offerFirst(num);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < rows; i++) {
            list.add(new ArrayList<>());
        }

        int i = 0;
        int j = 0;

        while(!queue.isEmpty()) {
            if(j < cols) {
                list.get(i).add(queue.poll());
                j++;
            }
            else {
                j = 0;
                i++;
            }            
        }
        return list;        
    }	
}
