package Problems;
import java.util.*;

public class FindLargestValueInEachTreeRow {
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
		public List<Integer> largestValues(TreeNode root) {
			List<Integer> list = new ArrayList<>();

			if (root == null) {
				return list;
			}
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);
			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				int max = Integer.MIN_VALUE;

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();
					max = Math.max(max, node.val);

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
				list.add(max);
			}
			return list;
		}
	}
}
