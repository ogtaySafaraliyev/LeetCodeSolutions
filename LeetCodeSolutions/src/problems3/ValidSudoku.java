package problems3;
import java.util.*;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9], cols = new boolean[9][9], boxes = new boolean[9][9];
        for (int r = 0; r < 9; r++)
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.')
                    continue;
                int d = board[r][c] - '1', k = (r / 3) * 3 + c / 3;
                if (rows[r][d] || cols[c][d] || boxes[k][d])
                    return false;
                rows[r][d] = cols[c][d] = boxes[k][d] = true;
            }
        return true;
    }
}
