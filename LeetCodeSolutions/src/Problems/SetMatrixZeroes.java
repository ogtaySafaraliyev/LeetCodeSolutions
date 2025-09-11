package Problems;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {        
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowWithZeroes = new boolean[rows];
        boolean[] colWithZeroes = new boolean[cols];

        for(int i = 0;  i < rows;  i++) {
            for(int j = 0;  j < cols;  j++) {
                if(matrix[i][j] == 0) {
                    rowWithZeroes[i] = true;
                    colWithZeroes[j] = true;
                }
            }
        }

        for(int i = 0;  i < rows;  i++) {
            for(int j = 0;  j < cols;  j++) {
                if(rowWithZeroes[i] || colWithZeroes[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
