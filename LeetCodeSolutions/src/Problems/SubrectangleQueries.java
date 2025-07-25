package Problems;

class SubrectangleQueries {
    private int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        int n = rectangle.length;
        this.rectangle = new int[rectangle.length][rectangle[0].length];
        for(int i=0;  i<n;  i++) {
            this.rectangle[i] = rectangle[i].clone();
        }
        
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2;  i++) {
            for(int j = col1; j <= col2;  j++) {
                this.rectangle[i][j] = newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
