package Problems;
import java.util.*;

public class ReverseOddLevelsOfBinaryTree {
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
		public TreeNode reverseOddLevels(TreeNode root) {
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);
			int level = 0;

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				List<TreeNode> levelAsList = new ArrayList<>();

				for (int i = 0; i < levelSize; i++) {
					TreeNode node = arrDeque.poll();
					levelAsList.add(node);

					if (node.left != null) {
						arrDeque.offer(node.left);
					}

					if (node.right != null) {
						arrDeque.offer(node.right);
					}
				}

				if (level % 2 == 1) {
					int left = 0;
					int right = levelAsList.size() - 1;
					while (left < right) {
						int temp = levelAsList.get(left).val;
						levelAsList.get(left).val = levelAsList.get(right).val;
						levelAsList.get(right).val = temp;
						left++;
						right--;
					}
				}

				level++;
			}
			return root;
		}
	}
}
