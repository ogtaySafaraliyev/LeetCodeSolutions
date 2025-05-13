package Problems;

public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        String[] ansArr = new String[s.length()];

        for(String word: strArr) {
            int num = word.charAt(word.length() - 1) - '1';
            ansArr[num] = word.substring(0, word.length() - 1);
        }

        StringBuilder strBlddr = new StringBuilder();
        for(String word: ansArr) {
            if(word != null){
                strBlddr.append(word).append(" ");
            }            
        }
        return strBlddr.toString().trim();
    }
}
