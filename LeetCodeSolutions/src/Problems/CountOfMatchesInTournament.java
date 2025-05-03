package Problems;

public class CountOfMatchesInTournament {
//	public int numberOfMatches(int n) {
//        int numberOfTeams = n;
//        int matches = 0;
//        int count = 0;
//        while (numberOfTeams > 1) {
//            count++;
//            
//            if (numberOfTeams % 2 == 0) {
//                // even
//                matches += numberOfTeams/2;
//                numberOfTeams /= 2;
//            } else {
//                // odd
//                matches += (numberOfTeams-1)/2;
//                numberOfTeams = (numberOfTeams-1)/2 + 1;
//            }
//        }
//        System.out.println(count);
//        return matches;    
//
//    }

     public int numberOfMatches(int n) {        
         return n-1;  
     }
}
