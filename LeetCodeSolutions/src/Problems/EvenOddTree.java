package Problems;
import java.util.*;

public class EvenOddTree {
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
		public boolean isEvenOddTree(TreeNode root) {
			List<List<Integer>> allLists = new ArrayList<>();

			if (root == null)
				return false;

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				List<Integer> list = new ArrayList<>();

				for (int i = 0; i < levelSize; i++) {
					TreeNode node = arrDeque.poll();
					list.add(node.val);

					if (node.left != null)
						arrDeque.offer(node.left);
					if (node.right != null)
						arrDeque.offer(node.right);
				}
				allLists.add(list);

			}

			for (int level = 0; level < allLists.size(); level++) {

				List<Integer> list = allLists.get(level);

				for (int i = 0; i < list.size(); i++) {
					int value = list.get(i);

					if (level % 2 == 0) {
						if (value % 2 == 0)
							return false;
					} else {
						if (value % 2 != 0)
							return false;
					}

					if (i > 0) {
						int prev = list.get(i - 1);

						if (level % 2 == 0) {
							if (prev >= value)
								return false;
						} else {
							if (prev <= value)
								return false;
						}
					}
				}
			}

			return true;
		}
	}
}
