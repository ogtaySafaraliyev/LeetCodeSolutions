package Problems;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int[][] colmnArr = new int[n][n];

        for(int row = 0; row<n; row++) {
            for(int colmn = 0; colmn<n;  colmn++) {
                colmnArr[row][colmn] = grid[colmn][row];
            }
        }
        int equalPairs = 0;

        for(int[] row: grid) {
            for(int[] colmn: colmnArr) {
                int isEqual = 1;
                for(int i = 0; i<n; i++) {
                    if(colmn[i] != row[i]) {
                        isEqual = 0;
                        break;
                    }
                }
                equalPairs += isEqual;
            }
        }

        return equalPairs;
    }
}
