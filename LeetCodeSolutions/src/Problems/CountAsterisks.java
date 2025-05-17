package Problems;

public class CountAsterisks {
    public int countAsterisks(String s) {
        int count = 0;

        String[] strArr = s.split("\\|");

        for (int i = 0; i < strArr.length; i = i + 2) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) == '*') {
                    count++;
                }
            }
        }
        return count;
    }
}
