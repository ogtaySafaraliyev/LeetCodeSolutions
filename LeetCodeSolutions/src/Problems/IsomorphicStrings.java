package Problems;
import java.util.*;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        if(sArr.length != tArr.length) {
            return false;
        }

        Map<Character, Character> sMappedToT = new HashMap<>();
        Map<Character, Character> tMappedToS = new HashMap<>();

        for(int i = 0;  i < sArr.length;  i++) {

            if(sMappedToT.containsKey(sArr[i])) {
                if(sMappedToT.get(sArr[i]) != tArr[i]) {
                    return false;
                }
            }

            if(tMappedToS.containsKey(tArr[i])) {
                if(tMappedToS.get(tArr[i]) != sArr[i]) {
                    return false;
                }
            }            
            
            sMappedToT.put(sArr[i], tArr[i]);
            tMappedToS.put(tArr[i], sArr[i]);            
        }

        return true;
    }
}
