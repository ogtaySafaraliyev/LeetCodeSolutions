package problems2;

public class MinimumNumberOfPushesToTypeWordI {
    public int minimumPushes(String word) {
        int totalPushes = 0;
        int pushPerChar = 1;
        int completeCombination = word.length() / 8;

        for(int i = 0; i < completeCombination; i++) {
            totalPushes += 8 * pushPerChar;
            pushPerChar++;
        }

        int remaining = word.length() % 8;
        totalPushes += remaining * pushPerChar;

        return totalPushes;
    }
}
