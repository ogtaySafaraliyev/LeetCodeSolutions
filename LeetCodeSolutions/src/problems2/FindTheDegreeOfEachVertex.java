package problems2;

public class FindTheDegreeOfEachVertex {
    // public int[] findDegrees(int[][] matrix) {
    //     int[] ans = new int[matrix.length];

    //     for (int[] node : matrix) {
    //         int i = 0;
    //         for (int num : node) {
    //             ans[i++] += num;
    //         }
    //         i++;
    //     }
    //     return ans;
    // }

    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int degree = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                degree += matrix[i][j];
            }
            ans[i] = degree;
        }
        return ans;
    }
}
