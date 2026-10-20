package problems3;
import java.util.*;

public class SurroundedRegions {
    public void solve(char[][] board) {
        Deque<int[]> queue = new ArrayDeque<>();

        int m = board.length;
        int n = board[0].length;
        //scanning 'O' on edges putting inside queue 
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                boolean isOnEdge = (i == 0 || j == 0 || i == m - 1 || j == n - 1); 
                if(isOnEdge && board[i][j] == 'O') {
                    board[i][j] = 'S';
                    queue.offer(new int[] {i, j});
                }
            }
        }

        //using bfs to to change all related with edge points: 'O' to 'S'  
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] d : dirs) {
                int r = cell[0] + d[0], c = cell[1] + d[1];
                if (r >= 0 && r < m && c >= 0 && c < n && board[r][c] == 'O') {
                    board[r][c] = 'S';
                    queue.offer(new int[]{r, c});
                }
            }

        }
        
        //you just need convert rest 'O' to 'x' and 'S' to 'O' 
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                else if(board[i][j] == 'S') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
