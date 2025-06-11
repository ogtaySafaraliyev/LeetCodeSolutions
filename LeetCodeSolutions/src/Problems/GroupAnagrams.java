package Problems;

import java.util.*;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hshMap = new HashMap<>();

        for(String word: strs) {
            String sortedWord = sortString(word);

            hshMap.computeIfAbsent(sortedWord, k -> new ArrayList<String>()).add(word);
        }    

        return new ArrayList<>(hshMap.values());          
    }

    public String sortString(String str) {
        char[] strArr = str.toCharArray();
        Arrays.sort(strArr);
        String sortedStr = String.valueOf(strArr);
        return sortedStr; 
    }

}
