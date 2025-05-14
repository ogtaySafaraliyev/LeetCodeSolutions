package Problems;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double ans = 0.0;
        int currentTime = 0;

        for(int[] customer: customers) {
            int arrival = customer[0];
            int time = customer[1]; 

            currentTime = Math.max(currentTime, arrival) + time;

            ans += (currentTime - arrival);
        }
        return ans / customers.length;
    }
}
