package Tree;

import java.util.List;

class ListNode {
	public int val;
	public List<ListNode> children;

	public ListNode() {
	}

	public ListNode(int _val, List<ListNode> _children) {
		val = _val;
		children = _children;
	}
}

public class MaxDepthTreeList {

	public int maxDepth(ListNode root) {
		if (root == null)
			return 0;
		int pre = 1;
		if (root.children != null) {
			List<ListNode> listNodes = root.children;
			for (ListNode l : listNodes) {
				int len = maxDepth(l);
				len++;
				if (len > pre) {
					pre = len;
				}
			}
		}
		return pre;
	}

	public int maxDepth2(ListNode root) {

		if (root == null)
			return 0;
		int max_depth = 0;
		for (ListNode itr : root.children) {
			if (itr != null)
				max_depth = Math.max(max_depth, maxDepth(itr));
		}
		return max_depth + 1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
