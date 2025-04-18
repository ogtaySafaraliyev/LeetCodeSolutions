package Problems;

public class FindMissingAndRepeatedValues {
	public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[grid.length * grid.length];
        int k = 0;

        for(int i=0; i<grid.length;  i++) {
            for(int j=0;  j<grid[i].length;  j++) {
                arr[k++] = grid[i][j];
            }
        }

        int[] seen = new int[grid.length * grid.length + 1];
        for(int num: arr) {
            if(seen[num] == 0){
                seen[num] = 1;
            }
            else if(seen[num] == 1){
                seen[num] = 2;
            }            
        }
        int[] ans  = new int[2];

        for(int i=1;  i<seen.length;  i++) {
            if(seen[i] == 2) {
                ans[0] = i;
            }
            else if(seen[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;        
    }
}
