package Problems;

public class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int rowCount = mat.length;
        int colCount = mat[0].length;

        int[] rowSum = new int[rowCount];
        int[] colSum = new int[colCount];

        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < colCount; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        int specialCount = 0;
        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < colCount; j++) {
                if(rowSum[i] == 1 && colSum[j] == 1 && mat[i][j] == 1) {
                    specialCount++;
                }
            }
        }   
        return specialCount;
    }
}
