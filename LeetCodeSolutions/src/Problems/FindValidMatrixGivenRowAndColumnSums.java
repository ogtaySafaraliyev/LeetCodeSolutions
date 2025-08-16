package Problems;

public class FindValidMatrixGivenRowAndColumnSums {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rowCount = rowSum.length;
        int colCount = colSum.length;

        int[][] restoredMatrix = new int[rowCount][colCount];

        for(int i = 0;  i < rowCount;  i++) {
            for(int j = 0;  j < colCount;  j++) {
                int value = Math.min(rowSum[i], colSum[j]);

                restoredMatrix[i][j] = value;

                rowSum[i] = rowSum[i] - value;
                colSum[j] = colSum[j] - value;
            }
        }

        return restoredMatrix;        
    }
}
