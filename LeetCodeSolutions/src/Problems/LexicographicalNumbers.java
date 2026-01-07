package Problems;
import java.util.*;

public class LexicographicalNumbers {
	public List<Integer> lexicalOrder(int n) {
		List<Integer> list = new ArrayList<>();
		int current = 1;

		for (int i = 0; i < n; i++) {
			list.add(current);

			if (current * 10 <= n) {
				current *= 10;
			} else {

				while (current % 10 == 9 || current + 1 > n) {
					current /= 10;
				}
				current++;
			}
		}
		return list;
	}
}
