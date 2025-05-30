package Problems;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) { 
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        for(String s: word1) {
            str1.append(s);
        }

        for(String s:word2) {
            str2.append(s);
        }
        String firstArr = str1.toString();
        String secondArr = str2.toString();

        return firstArr.equals(secondArr);

    }
}
