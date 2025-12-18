package Problems;
import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
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
		public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
			List<List<Integer>> allLevels = new ArrayList<>();
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			if (root == null)
				return allLevels;

			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				List<Integer> levelNodes = new ArrayList<>();

				for (int i = 0; i < levelSize; i++) {
					TreeNode node = arrDeque.poll();
					levelNodes.add(node.val);

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
				allLevels.add(levelNodes);
			}

			for (int i = 1; i < allLevels.size(); i += 2) {
				reverseOrder(allLevels.get(i));
			}

			return allLevels;
		}

		private List<Integer> reverseOrder(List<Integer> list) {
			int left = 0;
			int right = list.size() - 1;
			while (left < right) {
				int temp = list.get(left);
				list.set(left, list.get(right));
				list.set(right, temp);
				left++;
				right--;
			}
			return list;
		}
	}
}
