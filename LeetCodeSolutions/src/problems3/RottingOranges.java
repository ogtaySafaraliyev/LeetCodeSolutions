package problems3;
import java.util.*;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        Deque<int[]> queue = new ArrayDeque<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    fresh++;
                }
                else if(grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        int minutes = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                int[] curr = queue.poll();

                for (int[] d : dirs) {
                    int r = curr[0] + d[0], col = curr[1] + d[1];
                    if (r < 0 || col < 0 || r >= m || col >= n || grid[r][col] != 1) continue;
                        grid[r][col] = 2;
                        fresh--;
                        queue.offer(new int[]{r, col});
                }                
            }
            minutes++;
        }

        return (fresh == 0) ? minutes : -1;
    }
}
