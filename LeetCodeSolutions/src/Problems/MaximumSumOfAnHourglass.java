package Problems;

public class MaximumSumOfAnHourglass {
    // public int maxSum(int[][] grid) {
    //     int maxSumOfHourglass = 0;
    //     int rows = grid.length;
    //     int columns = grid[0].length;

    //     for (int i = 1; i < rows - 1; i++) {
    //         for (int j = 1; j < columns - 1; j++) {

    //             int sumHourglass = -grid[i][j - 1] - grid[i][j + 1];

    //             for (int x = i - 1; x <= i + 1; x++) {
    //                 for (int y = j - 1; y <= j + 1; y++) {
    //                     sumHourglass += grid[x][y];
    //                 }
    //                 maxSumOfHourglass = Math.max(maxSumOfHourglass, sumHourglass);
    //             }
    //         }
    //     }
    //     return maxSumOfHourglass;
    // }

    public int maxSum(int[][] grid) {
        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[i].length - 2; j++) {
                sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j]
                        + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
