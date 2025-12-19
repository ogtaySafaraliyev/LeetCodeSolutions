package Problems;
import java.util.*;

public class AverageOfLevelsInBinaryTree {
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
		public List<Double> averageOfLevels(TreeNode root) {
			List<Double> list = new ArrayList<>();
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			if (root == null)
				return list;
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				double avrg = 0;
				// double count = 0;
				int levelSize = arrDeque.size();

				for (int i = 0; i < levelSize; i++) {
					TreeNode node = arrDeque.poll();

					avrg += node.val;
					// count++;

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}

				double value = avrg / levelSize;
				list.add(value);
			}
			return list;
		}
	}
}
