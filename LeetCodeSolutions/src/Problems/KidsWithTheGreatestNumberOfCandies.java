package Problems;
import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= max) {
                list.add(true);
            }
            else {
                list.add(false);
            }

        }
        return list;
    }
}
