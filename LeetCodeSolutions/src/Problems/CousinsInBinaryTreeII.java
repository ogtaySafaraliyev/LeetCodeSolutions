package Problems;
import java.util.*;

public class CousinsInBinaryTreeII {
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
		public TreeNode replaceValueInTree(TreeNode root) {
			Deque<TreeNode> arrDeque = new ArrayDeque<>();
			Deque<Integer> depthQ = new ArrayDeque<>();
			Map<Integer, Integer> levelsSum = new HashMap<>();

			arrDeque.offer(root);
			depthQ.offer(0);

			// filling the level sums with bfs approach
			while (!arrDeque.isEmpty()) {
				TreeNode node = arrDeque.poll();
				int d = depthQ.poll();

				levelsSum.put(d, levelsSum.getOrDefault(d, 0) + node.val);
				if (node.left != null) {
					arrDeque.offer(node.left);
					depthQ.offer(d + 1);
				}

				if (node.right != null) {
					arrDeque.offer(node.right);
					depthQ.offer(d + 1);
				}
			}

			// updating new binary tree
			arrDeque.offer(root);
			depthQ.offer(0);
			root.val = 0;

			while (!arrDeque.isEmpty()) {
				int levelSize = arrDeque.size();
				for (int i = 0; i < levelSize; i++) {
					TreeNode parent = arrDeque.poll();
					int d = depthQ.poll();
					int nextLevel = d + 1;

					int childsSum = 0;
					if (parent.left != null)
						childsSum += parent.left.val;
					if (parent.right != null)
						childsSum += parent.right.val;

					if (parent.left != null) {
						parent.left.val = levelsSum.getOrDefault(nextLevel, 0) - childsSum;
						arrDeque.offer(parent.left);
						depthQ.offer(nextLevel);
					}

					if (parent.right != null) {
						parent.right.val = levelsSum.getOrDefault(nextLevel, 0) - childsSum;
						arrDeque.offer(parent.right);
						depthQ.offer(nextLevel);
					}
				}
			}
			return root;
		}
	}
}
