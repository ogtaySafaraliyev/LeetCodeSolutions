package Problems;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] arrOfS = s.split(" ");
        for(int i=0;  i<arrOfS.length;  i++) {
            arrOfS[i].trim();
        }
        return arrOfS[arrOfS.length - 1].length();
    }
}
