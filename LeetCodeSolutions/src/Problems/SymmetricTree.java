package Problems;
import java.util.*;

public class SymmetricTree {
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
		public boolean isSymmetric(TreeNode root) {
			if (root == null)
				return true;

			List<List<Integer>> levels = new ArrayList<>();
			Deque<TreeNode> queue = new LinkedList<>();
			queue.offer(root);

			while (!queue.isEmpty()) {
				int size = queue.size();
				List<Integer> level = new ArrayList<>();

				for (int i = 0; i < size; i++) {
					TreeNode node = queue.poll();

					if (node == null) {
						level.add(null);
					} else {
						level.add(node.val);
						queue.offer(node.left); // <-- add even if null
						queue.offer(node.right); // <-- add even if null
					}
				}

				if (!helperMethod(level)) {
					return false;
				}

				levels.add(level);
			}

			return true;
		}

		private boolean helperMethod(List<Integer> level) {
			int left = 0;
			int right = level.size() - 1;

			while (left < right) {
				if (!Objects.equals(level.get(left), level.get(right))) {
					return false;
				}
				left++;
				right--;
			}

			return true;
		}
	}
}
