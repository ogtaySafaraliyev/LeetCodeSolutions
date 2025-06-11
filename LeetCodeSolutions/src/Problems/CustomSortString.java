package Problems;

public class CustomSortString {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        StringBuilder strBldr = new StringBuilder();

        for(int i=0; i<s.length();  i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i=0;  i<order.length();  i++) {
            char ch = order.charAt(i);

            while(freq[ch - 'a'] > 0) {
                strBldr.append(ch);
                freq[ch - 'a']--;
            }
        }

        for(int i=0;  i<26;  i++) {
            while(freq[i] > 0) {
                strBldr.append((char)(i + 'a'));
                freq[i]--;
            }
        }

        return strBldr.toString();
    }
}
