package Problems;

import java.util.*;

public class FindTheMostCommonResponse {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> hshMp = new HashMap<>();
        List<List<String>> myList = new ArrayList<>();
        
        for(List<String> innerList: responses) {
            Set<String> innerSet = new HashSet<>();
            
            for(int i=0;  i<innerList.size();  i++) {
                innerSet.add(innerList.get(i));
            }    
            List<String> tempList = new ArrayList<>(innerSet);  
            myList.add(tempList);                     
        }

        for(List<String> innerList: myList) {
            for(int i=0;  i<innerList.size();  i++) {
                String key = innerList.get(i);
                hshMp.put(key, hshMp.getOrDefault(key, 0) + 1);
            }
        }

        int max = 0;
        String ans = "";
        
        for(Map.Entry<String, Integer> entry: hshMp.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();

            if(freq > max || (freq == max && word.compareTo(ans) < 0)){
                max = freq;
                ans = word;
            }
        }
        return ans;
    }
}
