package problems2;
import java.util.*;

public class AllNodesDistanceKInBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		Map<TreeNode, TreeNode> map = new HashMap<>();

		public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
			List<Integer> ans = new ArrayList<>();

			buildParentMap(root, null);

			Deque<TreeNode> queue = new ArrayDeque<>();
			Set<TreeNode> visited = new HashSet<>();

			queue.offer(target);
			visited.add(target);

			int distance = 0;

			while (!queue.isEmpty()) {
				int size = queue.size();

				if (distance == k) {

					for (TreeNode node : queue) {
						ans.add(node.val);
					}
					return ans;
				}

				for (int i = 0; i < size; i++) {
					TreeNode node = queue.poll();

					if (node.left != null && !visited.contains(node.left)) {
						queue.offer(node.left);
						visited.add(node.left);
					}

					if (node.right != null && !visited.contains(node.right)) {
						queue.offer(node.right);
						visited.add(node.right);
					}

					TreeNode parent = map.get(node);

					if (parent != null && !visited.contains(parent)) {
						queue.offer(parent);
						visited.add(parent);
					}

				}
				distance++;

			}
			return ans;

		}

		private void buildParentMap(TreeNode node, TreeNode parent) {
			if (node == null) {
				return;
			}

			map.put(node, parent);

			buildParentMap(node.left, node);
			buildParentMap(node.right, node);
		}
	}
}
