package problems3;
import java.util.*;

public class CompleteBinaryTreeInserter {
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

	class CBTInserter {
		List<TreeNode> treeNodes;

		public CBTInserter(TreeNode root) {
			treeNodes = new ArrayList<>();

			Deque<TreeNode> queue = new ArrayDeque<>();
			queue.offer(root);

			while (!queue.isEmpty()) {
				int levelSize = queue.size();

				for (int i = 0; i < levelSize; i++) {

					TreeNode node = queue.poll();
					treeNodes.add(node);

					if (node.left != null) {
						queue.offer(node.left);
					}
					if (node.right != null) {
						queue.offer(node.right);
					}
				}
			}
		}

		public int insert(int val) {
			int index = (treeNodes.size() - 1) / 2;
			TreeNode parentNode = treeNodes.get(index);

			TreeNode newNode = new TreeNode(val);
			treeNodes.add(newNode);

			if (parentNode.left == null) {
				parentNode.left = newNode;
			} else {
				parentNode.right = newNode;
			}

			return parentNode.val;
		}

		public TreeNode get_root() {
			return treeNodes.get(0);

		}
	}

	/**
	 * Your CBTInserter object will be instantiated and called as such: CBTInserter
	 * obj = new CBTInserter(root); int param_1 = obj.insert(val); TreeNode param_2
	 * = obj.get_root();
	 */
}
