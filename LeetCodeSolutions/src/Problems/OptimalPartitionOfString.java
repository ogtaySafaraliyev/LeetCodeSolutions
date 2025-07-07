package Problems;

import java.util.*;

public class OptimalPartitionOfString {
    public int partitionString(String s) {
        Set<Character> seen = new HashSet<>();
        int partitions = 1;  // At least one partition is needed

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                partitions++;       // Start a new substring
                seen.clear();       // Clear the set for new substring
            }
            seen.add(c);            // Add current character to set
        }

        return partitions;
    }
}
