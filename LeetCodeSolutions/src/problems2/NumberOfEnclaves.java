package problems2;
import java.util.*;

public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Deque<int[]> queue = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            if(grid[0][i] == 1) {
                queue.offer(new int[] {0, i});
                grid[0][i] = 0;                
            }
            if(grid[m - 1][i] == 1) {
                queue.offer(new int[] {m - 1, i});
                grid[m - 1][i] = 0;                
            }            
        }

        for(int i = 0; i < m; i++) {
            if(grid[i][0] == 1) {
                queue.offer(new int[] {i, 0});
                grid[i][0] = 0;
            }
            if(grid[i][n - 1] == 1) {
                queue.offer(new int[] {i, n - 1});
                grid[i][n - 1] = 0;
            }
        }

        int[][] direcs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!queue.isEmpty()) {
            int[] cell = queue.poll();
            
            for(int[] d: direcs) {
                int ni = cell[0] + d[0];
                int nj = cell[1] + d[1];

                if(ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == 1) {
                    grid[ni][nj] = 0;
                    queue.offer(new int[] {ni, nj});
                }
            }
        }

        int count = 0;
        for(int i = m - 1; i >= 0; i--) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;        
    }
}
