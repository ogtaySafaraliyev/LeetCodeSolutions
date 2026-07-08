package problems2;

public class FindAPeakElementII {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int top = 0;
        int bottom = rows - 1;

        while(top <= bottom) {
            int mid = (top + bottom) / 2;
            int maxCol = 0;

            for(int i = 0; i < cols; i++) {
                if(mat[mid][i] > mat[mid][maxCol]) {
                    maxCol = i;
                }
            }

            int upVal = (mid > 0) ? mat[mid - 1][maxCol] : -1;
            int downVal = (mid < rows - 1) ? mat[mid + 1][maxCol] : -1;

            if(mat[mid][maxCol] > upVal && mat[mid][maxCol] > downVal) {
                return new int[] {mid, maxCol};
            }

            if (upVal > mat[mid][maxCol]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }

        }
        return new int[] {-1, -1};
    }
}
