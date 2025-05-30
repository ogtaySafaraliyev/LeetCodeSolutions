package Problems;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        String ans = "";

        for(int i=0; i<sArr.length-1;  i++) {
            ans = ans + reverseWord(sArr[i]) + " ";

        }
        ans = ans + reverseWord(sArr[sArr.length - 1]);
        return ans;       

    }

    public String reverseWord(String str) {
        char[] myArr = str.toCharArray();
        int left = 0;
        int right = myArr.length - 1;

        while(left < right) {
            char temp = myArr[left];
            myArr[left] = myArr[right];
            myArr[right] = temp;
            left++;
            right--;
        }
        return new String(myArr);

    }
}
