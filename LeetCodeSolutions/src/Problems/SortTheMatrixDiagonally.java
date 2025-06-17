package Problems;

public class SortTheMatrixDiagonally {
    public int[][] diagonalSort(int[][] mat) {
        int rowSize = mat.length;
        int colSize = mat[0].length;
        
        for(int k=0;  k<Math.min(rowSize, colSize) - 1;  k++) {
            for(int i=0;  i<rowSize - 1;  i++) {
                for(int j=0;  j<colSize - 1;  j++) {
                    if(mat[i][j] > mat[i+1][j+1]) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[i+1][j+1];
                        mat[i+1][j+1] = temp;
                    }
                }
            }
        }
        return mat;
        
    }
}
