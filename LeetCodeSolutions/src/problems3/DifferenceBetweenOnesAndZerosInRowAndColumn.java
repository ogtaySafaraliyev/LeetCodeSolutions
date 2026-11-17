package problems3;

public class DifferenceBetweenOnesAndZerosInRowAndColumn {
	public int[][] onesMinusZeros(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;

        int[] rowOnesCount = new int[rowLen];
        int[] colOnesCount = new int[colLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                int value = grid[i][j];
                rowOnesCount[i] += value;
                colOnesCount[j] += value;
            }
        }

        int[][] diff = new int[rowLen][colLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                int totalOnes = rowOnesCount[i] + colOnesCount[j];
                int totalZeros = (rowLen - rowOnesCount[i]) + (colLen - colOnesCount[j]);
                diff[i][j] = totalOnes - totalZeros;
            }
        }
        return diff;
    }
}
