package Problems;
import java.util.*;

public class MostFrequentSubtreeSum {
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
		public int[] findFrequentTreeSum(TreeNode root) {
			if (root == null)
				return new int[0];

			Map<Integer, Integer> freq = new HashMap<>();

			postOrderDFS(root, freq);

			int maxFreq = 0;
			for (int count : freq.values()) {
				maxFreq = Math.max(maxFreq, count);
			}

			List<Integer> list = new ArrayList<>();
			for (var entry : freq.entrySet()) {
				int value = entry.getValue();
				if (value == maxFreq) {
					list.add(entry.getKey());
				}
			}

			int[] ans = new int[list.size()];
			int i = 0;
			for (int elmnt : list) {
				ans[i++] = elmnt;
			}

			return ans;
		}

		private int postOrderDFS(TreeNode node, Map<Integer, Integer> freq) {
			if (node == null)
				return 0;

			int sum = 0;

			int left = postOrderDFS(node.left, freq);
			int right = postOrderDFS(node.right, freq);

			sum = node.val + left + right;
			freq.put(sum, freq.getOrDefault(sum, 0) + 1);

			return sum;
		}

	}
}
