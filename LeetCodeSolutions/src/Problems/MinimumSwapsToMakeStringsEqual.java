package Problems;

public class MinimumSwapsToMakeStringsEqual {
	public int minimumSwap(String s1, String s2) {
        int countXY = 0;
        int countYX = 0;

        for(int i=0;  i < s1.length();  i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 == 'x' && ch2 == 'y') {
                countXY++;
            }
            
            if(ch1 == 'y' && ch2 == 'x') {
                countYX++;
            }
        }

        if(((countXY + countYX) & 1) == 1) {
            return -1;
        }

        return countXY / 2 + countYX / 2 + countXY % 2 + countYX % 2;
    }
}
