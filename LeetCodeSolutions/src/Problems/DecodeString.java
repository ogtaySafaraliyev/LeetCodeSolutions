package Problems;
import java.util.*;

public class DecodeString {
	public String decodeString(String s) {
        Stack<String> stackStr = new Stack<>();
        Stack<Integer> stackCnt = new Stack<>();

        String currentStr = "";
        int resetCnt = 0;
        
        for(char ch: s.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                resetCnt = resetCnt * 10 + (ch - '0');
            }

            else if(ch == '[') {
                stackCnt.push(resetCnt);
                stackStr.push(currentStr);

                currentStr = "";
                resetCnt = 0;
            }        

            else if(ch == ']') {
                int number = stackCnt.pop();
                String piece = stackStr.pop();
                
                StringBuilder strBldr = new StringBuilder(piece);
                for(int i = 0;  i < number;  i++) {
                    strBldr.append(currentStr);
                }
                currentStr = strBldr.toString();
            }                
            
            else if(ch >= 'a' && ch <= 'z') {
                currentStr += ch;
            }
        }
        return currentStr;

    }
}
