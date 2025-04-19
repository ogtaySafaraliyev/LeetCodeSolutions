package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
	public String[] sortPeople(String[] names, int[] heights) {
		HashMap<Integer, String> hshMap = new HashMap<Integer, String>();

		for (int i = 0; i < heights.length; i++) {
			hshMap.put(heights[i], names[i]);
		}

		Arrays.sort(heights);
		String[] namesAfterSorting = new String[heights.length];

		for (int i = 0, j = heights.length - 1; i < heights.length; i++) {
			namesAfterSorting[i] = hshMap.get(heights[j--]);
		}
		return namesAfterSorting;
	}
}
