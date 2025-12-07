package Problems;
import java.util.*;

public class OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        String ans = "";
        if(k == 1) {            
            String smallest = s;
            for(int i = 1; i < s.length(); i++) {                
                String rotated = s.substring(i) + s.substring(0, i);
                if(rotated.compareTo(smallest) < 0) {
                    smallest = rotated;
                }
            }
            ans = smallest;
        }   

        else {
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            StringBuilder strBldr = new StringBuilder();
            for(char ch: characters) {
                strBldr.append(ch);
            }
            ans = strBldr.toString();
        }      
        return ans;
    }
}
