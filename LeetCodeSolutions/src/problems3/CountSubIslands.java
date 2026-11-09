package problems3;
import java.util.*;

public class CountSubIslands {
	private static final int[][] DIRS = {{1,0},{-1,0},{0,1},{0,-1}};

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count = 0;
        for(int i = 0; i < grid1.length; i++) {
            for(int j = 0; j < grid1[0].length; j++) {
                if(grid2[i][j] == 1 && bfs(grid1, grid2, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean bfs(int[][] g1, int[][] g2, int r, int c) {
        int m = g2.length, n = g2[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{r, c});
        g2[r][c] = 0;                      // mark visited when enqueued
        boolean isSub = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];

            if (g1[x][y] == 0) isSub = false;   // keep exploring anyway

            for (int[] d : DIRS) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && g2[nx][ny] == 1) {
                    g2[nx][ny] = 0;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
        return isSub;
    }
}
