package problems2;
import java.util.*;

public class SequentialDigits {
	public List<Integer> sequentialDigits(int low, int high) {
		List<Integer> list = new ArrayList<>();
		String digits = "123456789";

		for (int len = 2; len <= 9; len++) {
			for (int start = 0; start + len <= 9; start++) {
				int num = Integer.valueOf(digits.substring(start, start + len));
				if (num >= low && num <= high) {
					list.add(num);
				}
			}
		}
		return list;
	}
}
