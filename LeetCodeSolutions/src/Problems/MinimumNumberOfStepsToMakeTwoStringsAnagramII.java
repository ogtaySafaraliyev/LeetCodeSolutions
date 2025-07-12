package Problems;

//import java.util.*;

public class MinimumNumberOfStepsToMakeTwoStringsAnagramII {
	// public int minSteps(String s, String t) {
    //     char[] sArr = s.toCharArray();
    //     char[] tArr = t.toCharArray();

    //     int[] freq = new int[26];

    //     for (char ch : sArr) {
    //         freq[ch - 'a']++;
    //     }

    //     for (char ch : tArr) {
    //         freq[ch - 'a']--;
    //     }

    //     int minNumberOfSteps = 0;
    //     for (int count : freq) {
    //         minNumberOfSteps += Math.abs(count);
    //     }
    //     return minNumberOfSteps;

    // }

     public int minSteps(String s, String t) {
         int[] countS = new int[26];
         int[] countT = new int[26];
    
         for (char c : s.toCharArray()) {
             countS[c - 'a']++;
         }
    
         for (char c : t.toCharArray()) {
             countT[c - 'a']++;
         }

         int steps = 0;
         for (int i = 0; i < 26; i++) {
             steps += Math.abs(countS[i] - countT[i]);
         }

         return steps;
     }

//    public int minSteps(String s, String t) {
//        HashMap<Character, Integer> hshMap = new HashMap<>();
//
//        for(int i=0; i<s.length(); i++) {
//            hshMap.put(s.charAt(i), hshMap.getOrDefault(s.charAt(i), 0) + 1); 
//        }
//
//        for(int i=0; i<t.length(); i++) {
//            hshMap.put(t.charAt(i), hshMap.getOrDefault(t.charAt(i), 0) - 1); 
//        }
//
//        // Calculate the total number of deletions needed
//        int steps = 0;
//        for (var count: hshMap.values()) {
//            steps += Math.abs(count);
//        }
//
//        return steps;
//    }
}
