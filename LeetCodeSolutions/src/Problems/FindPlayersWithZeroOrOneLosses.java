package Problems;
import java.util.*;

public class FindPlayersWithZeroOrOneLosses {
	public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> hshMap = new HashMap<>();
        
        for(int[] match: matches) {            
            int winner = match[0]; 
            int loser = match[1];

            hshMap.putIfAbsent(winner, 0);
            hshMap.put(loser, hshMap.getOrDefault(loser, 0) + 1);
                       
        }

        List<List<Integer>> winnersList = new ArrayList<>();
        winnersList.add(new ArrayList<>());
        winnersList.add(new ArrayList<>());

        for(var element: hshMap.entrySet()) {
            int player = element.getKey();
            int lostGames = element.getValue();

            if(lostGames == 0) {
                winnersList.get(0).add(player);
            }
            else if(lostGames == 1) {
                winnersList.get(1).add(player);
            }
        }

        Collections.sort(winnersList.get(0));
        Collections.sort(winnersList.get(1));

        return winnersList;

    }
}
