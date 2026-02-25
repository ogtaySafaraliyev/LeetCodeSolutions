package Problems;
import java.util.*;

public class MinimumNumberOfOperationsToSortABinaryTreeByLevel {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int minimumOperations(TreeNode root) {
			int totalSwaps = 0;
			if (root == null)
				return totalSwaps;

			List<List<Integer>> levels = new ArrayList<>();
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				ArrayList<Integer> level = new ArrayList<>();

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();
					level.add(node.val);

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
				levels.add(level);
			}

			for (List<Integer> level : levels) {
				totalSwaps += minSwaps(level);
			}
			return totalSwaps;
		}

		private int minSwaps(List<Integer> level) {
			int k = 0;
			List<Integer> sortedList = new ArrayList<>(level);
			Collections.sort(sortedList);

			Map<Integer, Integer> hshMap = new HashMap<>();
			for (int i = 0; i < level.size(); i++) {
				hshMap.put(level.get(i), i);
			}

			for (int i = 0; i < level.size(); i++) {

				if (level.get(i).equals(sortedList.get(i))) {
					continue;
				}
				k++;

				int currentValue = level.get(i);
				int correctValue = sortedList.get(i);

				int correctIndex = hshMap.get(correctValue);

				Collections.swap(level, i, correctIndex);

				// Update map after swap
				hshMap.put(currentValue, correctIndex);
				hshMap.put(correctValue, i);
			}
			return k;
		}
	}
}
