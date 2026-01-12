package Problems;
import java.util.*;

public class NAryTreeLevelOrderTraversal {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	class Solution {
		public List<List<Integer>> levelOrder(Node root) {
			List<List<Integer>> ansList = new ArrayList<>();
			if (root == null)
				return ansList;

			Deque<Node> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				List<Integer> level = new ArrayList<>();

				for (int i = 0; i < size; i++) {
					Node node = arrDeque.poll();
					level.add(node.val);

					if (node.children != null) {
						for (Node child : node.children) {
							arrDeque.offer(child);
						}
					}

				}
				ansList.add(level);
			}
			return ansList;
		}
	}
}
