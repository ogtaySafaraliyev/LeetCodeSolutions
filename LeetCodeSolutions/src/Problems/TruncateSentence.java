package Problems;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {

        String[] arrS = s.split(" ");
        String[] reqArr = new String[k];

        for(int i=0;  i<k;  i++) {
            reqArr[i] = arrS[i];
        }

        return String.join(" ", reqArr);
    }
}
