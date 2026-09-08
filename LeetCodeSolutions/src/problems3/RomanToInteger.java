package problems3;
import java.util.*;

public class RomanToInteger {
    // public int romanToInt(String s) {
    //     int len = s.length();
    //     int[] arr = new int[len];

    //     for(int i = 0; i < len; i++) {
    //         char ch = s.charAt(i);

    //         if(ch == 'M') {
    //             arr[i] = 1000;
    //         }
    //         else if(ch == 'D') {
    //             arr[i] = 500;
    //         }
    //         else if(ch == 'C') {
    //             arr[i] = 100;
    //         }
    //         else if(ch == 'L') {
    //             arr[i] = 50;
    //         }
    //         else if(ch == 'X') {
    //             arr[i] = 10;
    //         }
    //         else if(ch == 'V') {
    //             arr[i] = 5;
    //         }
    //         else if(ch == 'I') {
    //             arr[i] = 1;
    //         }
    //     }

    //     int ans = 0;
    //     for(int i = 0; i < len - 1; i++) {
    //         if(arr[i] < arr[i + 1]) {
    //             ans -= arr[i];
    //         }
    //         else {
    //             ans += arr[i];
    //         }
    //     }
    //     return ans + arr[len - 1];
    // }

    public int romanToInt(String s) { 
        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        int len = s.length();

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 7; i++) {
            map.put(symbols[i], values[i]);
        }

        int ans = map.get(s.charAt(len - 1));

        for(int i = 0; i < len - 1; i++) {
            int sign = map.get(s.charAt(i)) < map.get(s.charAt(i + 1)) ? -1 : 1;
            ans += sign * map.get(s.charAt(i));
        }

        return ans;
    }
}
