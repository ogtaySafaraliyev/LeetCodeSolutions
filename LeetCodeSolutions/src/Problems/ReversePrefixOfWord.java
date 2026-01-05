package Problems;

public class ReversePrefixOfWord {
     public String reversePrefix(String word, char ch) {
         int index = word.indexOf(ch);

         if(index == -1) {
             return word;
         }
         String prefix = word.substring(0, index + 1);
         String theRest = word.substring(index + 1);
         prefix = reverseWord(prefix);

         String ans = prefix.concat(theRest);
         return ans;
     }

     private String reverseWord(String str) {
         char[] chArr = str.toCharArray();
         int left = 0;
         int right = chArr.length - 1; 

         while(left < right) {
             char temp = chArr[left];
             chArr[left] = chArr[right];
             chArr[right] = temp;

             left++;
             right--;
         }
         return new String(chArr);
     }
}
