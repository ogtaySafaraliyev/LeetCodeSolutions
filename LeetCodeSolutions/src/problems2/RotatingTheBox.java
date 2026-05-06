package problems2;
import java.util.*;

public class RotatingTheBox {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int rows = boxGrid.length;
        int cols = boxGrid[0].length;

        char[][] rotatedBox = new char[cols][rows];
        // just rotating box without gravity 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                rotatedBox[j][rows - i - 1] = boxGrid[i][j];
            }
        }
        // solving gravity issue;
        for(int i = 0; i < rows; i++) {

            Deque<Integer> emptyPos = new ArrayDeque<>();

            for(int j = cols - 1; j >= 0;  j--) {
                if(rotatedBox[j][i] == '*'){
                    emptyPos.clear();
                }
                else if(rotatedBox[j][i] == '.') {
                    emptyPos.offer(j);
                }
                else if(rotatedBox[j][i] == '#' && !emptyPos.isEmpty()) {
                    int lowestEmptyPos = emptyPos.poll();
                    
                    rotatedBox[lowestEmptyPos][i] = '#';
                    rotatedBox[j][i] = '.';

                    emptyPos.offer(j);
                }
            }
        }
        return rotatedBox;
    }
}
