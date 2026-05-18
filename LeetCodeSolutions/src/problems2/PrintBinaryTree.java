package problems2;
import java.util.*;

public class PrintBinaryTree {
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
		public List<List<String>> printTree(TreeNode root) {
			List<List<String>> result = new ArrayList<>();
			int height = dfs(root);
			int cols = (1 << height) - 1;

			for (int i = 0; i < height; i++) {
				List<String> row = new ArrayList<>(Collections.nCopies(cols, ""));
				result.add(row);
			}

			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			Deque<int[]> queue = new LinkedList<>();

			arrDeque.offer(root);
			queue.offer(new int[] { 0, 0, cols - 1 }); // row left right

			while (!arrDeque.isEmpty()) {
				TreeNode node = arrDeque.poll();
				int[] pos = queue.poll();

				int row = pos[0];
				int left = pos[1];
				int right = pos[2];
				int mid = (left + right) / 2;

				result.get(row).set(mid, String.valueOf(node.val));

				if (node.left != null) {
					arrDeque.offer(node.left);
					queue.offer(new int[] { row + 1, left, mid - 1 });
				}

				if (node.right != null) {
					arrDeque.offer(node.right);
					queue.offer(new int[] { row + 1, mid + 1, right });
				}
			}
			return result;
		}

		private int dfs(TreeNode node) {
			if (node == null)
				return 0;

			return 1 + Math.max(dfs(node.left), dfs(node.right));
		}
	}
}
