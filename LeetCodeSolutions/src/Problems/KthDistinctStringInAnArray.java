package Problems;
import java.util.*;

public class KthDistinctStringInAnArray {
     public String kthDistinct(String[] arr, int k) {
         HashMap <String, Integer> hshMap = new HashMap<>();
         ArrayList<String> list = new ArrayList<>();
        
         for(int i=0;  i<arr.length;  i++) {
             hshMap.put(arr[i],  hshMap.getOrDefault(arr[i], 0) + 1);
         }

         for(String element: arr) {
             if(hshMap.get(element) == 1) {
                 list.add(element);
                
             }
         }
         if(list.isEmpty() || list.size() < k) {
             return "";
         }
         else {
             return list.get(k-1);

         }
        
     }
}
