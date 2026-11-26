package problems4;

public class StoneRemovalGame {
	public boolean canAliceWin(int n) {
        int count = 0;
        int removedStones = 10;
        while(n >= removedStones && removedStones > 0) {
            n -= removedStones;
            removedStones--;
            count++;
        }
        return count % 2 == 1;
    }
}
