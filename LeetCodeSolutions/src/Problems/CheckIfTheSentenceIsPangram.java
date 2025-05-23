package Problems;

public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        boolean isYeah = true;

        for(char ch: sentence.toCharArray()) {
            count[ch - 'a']++;
        }

        for(int num: count) {
            if(num == 0) {
                isYeah = false;
                break;
            }
        }
        return isYeah;
    }
}
