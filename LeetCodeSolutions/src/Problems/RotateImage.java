package Problems;

public class RotateImage {
	public void rotate(int[][] matrix) {
        // matrix[2][0] / matrix[1][0] / matrix[0][0] 
        // matrix[2][1] / matrix[1][1] / matrix[0][1]
        // matrix[2][2] / matrix[1][2] / matrix[0][2]       

        // int i = matrix.length - 1; 

        // matrix[i--][j]
        // j++

        // matrix[i--][j]
        // j++

        // matrix[i--][j]
        // j++

        int n = matrix.length;
        // Step 1: Flip the matrix upside down
        for (int i = 0; i < n / 2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - 1 - i];
            matrix[n - 1 - i] = temp;
        }
        

        // Step 2: Transpose the matrix (swap rows and columns along main diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
   

    }
}
