package problems2;
import java.util.*;

public class FindDuplicateSubtrees {
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
		Map<String, Integer> freq = new HashMap<>();
		List<TreeNode> list = new ArrayList<>();

		public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
			dfsSerialize(root);
			return list;
		}

		private String dfsSerialize(TreeNode node) {
			if (node == null)
				return "#";

			String left = dfsSerialize(node.left);
			String right = dfsSerialize(node.right);

			String serialization = node.val + "," + left + "," + right;

			int count = freq.getOrDefault(serialization, 0) + 1;
			freq.put(serialization, count);

			if (count == 2) {
				list.add(node);
			}

			return serialization;
		}
	}
}
