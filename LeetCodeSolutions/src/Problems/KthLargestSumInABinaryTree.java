package Problems;
import java.util.*;

public class KthLargestSumInABinaryTree {
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
		public long kthLargestLevelSum(TreeNode root, int k) {
			List<Long> sumsList = new ArrayList<>();
			// if(root == null) return 0L;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				long levelSum = 0;

				for (int i = 0; i < size; i++) {
					TreeNode node = arrDeque.poll();
					levelSum += node.val;

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}

				sumsList.add(levelSum);
			}

			Collections.sort(sumsList);

			return (sumsList.size() >= k) ? sumsList.get(sumsList.size() - 1 - (k - 1)) : -1;
		}
	}
}
