package Problems;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
	public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        char ch = chars[0];
        int count = 0;

        for(int i = 1; i < chars.length; i++) {
            if(ch != s.charAt(i)) {
                ch = s.charAt(i);

                count++; 
            }
        }
        return count <= 1;        
    }
}
