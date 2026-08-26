package problems3;
import java.util.*;

public class NumberOfIslands {
	public int numIslands(char[][] grid) {
        int cols = grid[0].length;
        int rows = grid.length;
        int count = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    bfs(grid, i, j);
                    count++;
                }                
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int startR, int startC) {
        int cols = grid[0].length;
        int rows = grid.length;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startR, startC});
        grid[startR][startC] = '0'; // sink as soon as it's enqueued

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];

            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == '1') {
                    grid[nr][nc] = '0'; // sink before adding to avoid duplicate enqueues
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
