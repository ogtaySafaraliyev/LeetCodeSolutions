package Problems;
import java.util.*;

public class AmountOfTimeForBinaryTreeToBeInfected {
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

		public int amountOfTime(TreeNode root, int start) {
			// Step 1: Build parent map and find start node
			Map<TreeNode, TreeNode> parentMap = new HashMap<>();
			TreeNode startNode = buildParentMap(root, null, start, parentMap);

			// Step 2: BFS from start node
			Queue<TreeNode> queue = new LinkedList<>();
			Set<TreeNode> visited = new HashSet<>();

			queue.offer(startNode);
			visited.add(startNode);

			int minutes = -1; // because first level is time = 0

			while (!queue.isEmpty()) {
				int size = queue.size();
				minutes++;

				for (int i = 0; i < size; i++) {
					TreeNode current = queue.poll();

					// Check left child
					if (current.left != null && !visited.contains(current.left)) {
						visited.add(current.left);
						queue.offer(current.left);
					}

					// Check right child
					if (current.right != null && !visited.contains(current.right)) {
						visited.add(current.right);
						queue.offer(current.right);
					}

					// Check parent
					TreeNode parent = parentMap.get(current);
					if (parent != null && !visited.contains(parent)) {
						visited.add(parent);
						queue.offer(parent);
					}
				}
			}

			return minutes;
		}

		private TreeNode buildParentMap(TreeNode node, TreeNode parent, int start, Map<TreeNode, TreeNode> parentMap) {
			if (node == null)
				return null;

			parentMap.put(node, parent);

			if (node.val == start) {
				// Still continue DFS to fill full parent map
				buildParentMap(node.left, node, start, parentMap);
				buildParentMap(node.right, node, start, parentMap);
				return node;
			}

			TreeNode left = buildParentMap(node.left, node, start, parentMap);
			TreeNode right = buildParentMap(node.right, node, start, parentMap);

			if (left != null)
				return left;
			if (right != null)
				return right;

			return null;
		}

	}
}
