package Problems;

public class SortTheStudentsByTheirKthScore {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n = score.length;

        // Bubble sort (or any sorting algorithm) in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (score[j][k] < score[j + 1][k]) {
                    // Swap entire rows
                    int[] temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }

        return score;
    }

    // public int[][] sortTheStudents(int[][] score, int k) {
    //     Arrays.sort(score, (a, b) -> b[k] - a[k]);
    //     return score;
    // }
}
