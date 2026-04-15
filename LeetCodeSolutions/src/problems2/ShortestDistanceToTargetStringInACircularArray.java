package problems2;

public class ShortestDistanceToTargetStringInACircularArray {
    public int closestTarget(String[] words, String target, int startIndex) {
        int minDistance = words.length;

        for(int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            if(currentWord.equals(target)) {

                int directDistance = Math.abs(i - startIndex);
                int wrapAroundDistance = words.length - directDistance;

                int currentMin = Math.min(directDistance, wrapAroundDistance);
                minDistance = Math.min(minDistance, currentMin);
            }
        }
        return minDistance == words.length ? -1 : minDistance;
    }
}
