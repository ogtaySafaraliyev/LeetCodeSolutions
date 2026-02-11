package Problems;
import java.util.*;

public class MaximumDepthOfNAryTree {
	// Definition for a Node.
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
		public int maxDepth(Node root) {
			if (root == null)
				return 0;

			Deque<Node> arrDeque = new ArrayDeque<>();
			arrDeque.offer(root);
			int maxDepth = 0;

			while (!arrDeque.isEmpty()) {
				int size = arrDeque.size();
				maxDepth++;

				for (int i = 0; i < size; i++) {
					Node current = arrDeque.poll();
					if (current.children != null) {
						for (Node child : current.children) {
							arrDeque.offer(child);
						}
					}
				}
			}
			return maxDepth;
		}
	}
}
