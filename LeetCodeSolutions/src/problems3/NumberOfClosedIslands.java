package problems3;
import java.util.*;

public class NumberOfClosedIslands {
	class Solution {
	    public int closedIsland(int[][] grid) {
	        int cols = grid[0].length;
	        int rows = grid.length;
	        int count = 0;
	        int[][] direcs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

	        for(int i = 0; i < rows; i++) {
	            for(int j = 0; j < cols; j++) {
	                if(grid[i][j] == 0) {
	                    boolean isClosed = true;

	                    Queue<int[]> queue = new ArrayDeque<>();
	                    queue.offer(new int[] {i, j});
	                    grid[i][j] = 1;

	                    while(!queue.isEmpty()) {
	                        int[] cell = queue.poll();
	                        int r = cell[0];
	                        int c = cell[1];

	                        if(r == 0 || c == 0 || r == rows - 1 || c == cols - 1) {
	                            isClosed = false;
	                        }

	                        for (int[] d : direcs) {
	                            int nr = r + d[0], nc = c + d[1];
	                            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == 0) {
	                                grid[nr][nc] = 1;
	                                queue.offer(new int[]{nr, nc});
	                            }
	                        }
	                    }

	                    if(isClosed) count++;                    
	                }
	            }
	        }
	        return count;

	    }
	}
}
