package problems2;
import java.util.*; 

public class MinimumInitialEnergyToFinishTasks {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (tasks1, tasks2) -> (tasks1[0] - tasks1[1]) - (tasks2[0] - tasks2[1]));

        int totalMinEffort = 0;
        int currentEffort = 0;

        for(int[] task: tasks) {
            int actualEffortNeeded = task[0];
            int minEffortRequired = task[1];

            if(currentEffort < minEffortRequired) {
                int additionalEffortNeeded = minEffortRequired - currentEffort;
                totalMinEffort += additionalEffortNeeded;
                currentEffort = minEffortRequired;
            }
            currentEffort -= actualEffortNeeded;
        }
        return totalMinEffort;
    }
}
