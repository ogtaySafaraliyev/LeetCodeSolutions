package Problems;
import java.util.*;

public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> hshMap = new HashMap<>();
        int value = 0;

        for(char ch: key.toCharArray()) {
            if(ch != ' ' && !hshMap.containsKey(ch)){
                hshMap.put(ch, (char)(value + 'a'));
                value++;
                if (value == 26) break;
            }
            
            
        }

        StringBuilder strBldr = new StringBuilder();
        for(char ch: message.toCharArray()){
            if(ch != ' ') {
                strBldr.append(hshMap.get(ch));
            }
            else {
                strBldr.append(' ');
            }
        }

        return strBldr.toString();
        
    }
}
