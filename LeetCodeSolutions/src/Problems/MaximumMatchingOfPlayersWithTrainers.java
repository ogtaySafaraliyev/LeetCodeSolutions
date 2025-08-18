package Problems;
import java.util.*;

public class MaximumMatchingOfPlayersWithTrainers {
	public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);

        int ans = 0;
        int indexTrainers = 0;

        for(int player: players) {
            while(indexTrainers < trainers.length && trainers[indexTrainers] < player) {
                indexTrainers++;
            }

            if(indexTrainers < trainers.length && trainers[indexTrainers] >= player) {
                indexTrainers++;
                ans++;
            }
        }
    
        return ans;
    }
}
