package problems2;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid[0].length; i++) {
            for(int j = grid.length - 1; j >= 0 ; j--) {                
                if(grid[j][i] < 0)  count++;                    
            }
        }
        return count; 
    }
}
