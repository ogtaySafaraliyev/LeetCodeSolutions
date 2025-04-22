package Problems;

public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;        
        for(int i=0; i<s.length();  i++) {
            char ch = s.charAt(i);
            for(int j=0;  j<t.length();  j++){
                if(t.charAt(j) == ch) {
                    ans += Math.abs(i - j);                    
                }
            }   
        }
        return ans;        
    }
}
