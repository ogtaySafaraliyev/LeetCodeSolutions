package Problems;

public class QueriesOnNumberOfPointsInsideACircle {
	public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        int i = 0;

        for (int[] query : queries) {
            int count = 0;
            int x = query[0];
            int y = query[1];
            int radius = query[2];

            for (int[] point : points) {
                int wantedX = point[0];
                int wantedY = point[1];

                int dx = x - wantedX;
                int dy = y - wantedY;
                if (dx * dx + dy * dy <= radius * radius) {
                    count++;
                }
            }
            arr[i] = count;
            i++;

        }
        return arr;
    }
}
