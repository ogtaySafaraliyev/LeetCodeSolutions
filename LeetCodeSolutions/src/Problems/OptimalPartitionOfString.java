package Problems;

import java.util.*;

public class OptimalPartitionOfString {
//    public int partitionString(String s) {
//        Set<Character> seen = new HashSet<>();
//        int partitions = 1;  // At least one partition is needed
//
//        for (char c : s.toCharArray()) {
//            if (seen.contains(c)) {
//                partitions++;       // Start a new substring
//                seen.clear();       // Clear the set for new substring
//            }
//            seen.add(c);            // Add current character to set
//        }
//
//        return partitions;
//    }
    
    public int partitionString(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int partitions = 1; // At least one partition is required

        for (char c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                // Duplicate character found — start new substring
                partitions++;
                charMap.clear(); // Clear map for the new substring
            }
            charMap.put(c, 1); // Add current character to map
        }

        return partitions;
    }
}
