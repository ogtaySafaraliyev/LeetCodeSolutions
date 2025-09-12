package Problems;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    // public int strStr(String haystack, String needle) {
    //     return haystack.indexOf(needle);
    // }

    public int strStr(String haystack, String needle) {
        int lenN = needle.length();         

        for(int i = 0; i <= haystack.length() - lenN;  i++) {
            String piece = haystack.substring(i, i + lenN);
            if(piece.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
