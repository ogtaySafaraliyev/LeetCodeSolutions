package Problems;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] sArr = s.trim().split("\\s+");

        int left = 0;
        int right = sArr.length - 1;

        while(left < right) {
            String temp = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = temp;

            left++;
            right--;
        }

        StringBuilder strBldr = new StringBuilder();

        for(int i = 0;  i < sArr.length - 1;  i++) {
            strBldr.append(sArr[i]).append(" ");
        }
        strBldr.append(sArr[sArr.length - 1]);
        return strBldr.toString();
    }
}
