package Problems;

import java.util.ArrayList;
import java.util.List;

public class NumberOfArithmeticTriplets {
	//first method with only array
	
	// public int arithmeticTriplets(int[] nums, int diff) {
	// boolean[] seen = new boolean[301];
	// for(int num: nums) {
	// seen[num] = true;
	// }

	// int count = 0;

	// for(int num: nums) {
	// if(seen[num + diff] && seen[num + 2 * diff]) {
	// count++;
	// }
	// }
	// return count;
	// }
	
	// second method with List
	public int arithmeticTriplets(int[] nums, int diff) {
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for (int num : nums) {
			list.add(num);
		}
		for (int num : nums) {
			if (list.contains(num - diff) && list.contains(num - (2 * diff))) {
				++count;
			}
		}
		return count;
	}
}
