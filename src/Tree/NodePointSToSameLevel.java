package Tree;

import java.util.LinkedList;

/*
 * You are given a binary tree, consisting of node objects where each node has a pointer/reference to
its left and right children nodes.
 
Your task is to link the levels of the tree by setting a pointer/reference `s` on each node to be
the next node to the right on the same level, or null if it is the last node on its level.
 
Here is an example input tree:
 
              1                  
         /      \
       2          3           
     /  \              \
   4      5              6       
  /        \              \
 7          8              9     
 
Your code should set s on each node as shown by the arrows here:
 
              1                -> null
           /      \
       2      ->     3 - 2         -> null
     /  \              \
   4 -3  ->  5      ->      6     -> null
  /        \              \
 7    ->    8     ->       9   -> null
 
Use the language of your choice.
 */

class NodeBT {

	int val;
	NodeBT left;
	NodeBT right;
	NodeBT s;

	public NodeBT(int val) {
		left = null;
		right = null;
		s = null;
		this.val = val;
	}
}

public class NodePointSToSameLevel {

	// space n time n
	static void link_the_tree(NodeBT root) {
		LinkedList<NodeBT> queue = new LinkedList<NodeBT>();
		LinkedList<Integer> level = new LinkedList<Integer>();

		root.s = null;
		queue.add(root);
		level.add(1);

		while (queue.size() != 0) {
			NodeBT temp = queue.poll();
			int l = level.poll();

			if (queue.size() > 0 && queue.getFirst() != null && level.getFirst() == l) {
				temp.s = queue.getFirst();
			}

			if (temp.left != null) {
				queue.add(temp.left);
				level.add(l + 1);
			}

			if (temp.right != null) {
				queue.add(temp.right);
				level.add(l + 1);
			}

		}

	}

	// Fastest Time n Space (1);
	public NodeBT connect(NodeBT root) {
		NodeBT dummyHead = new NodeBT(0);
		NodeBT pre = dummyHead;
		NodeBT r = root;
		while (root != null) {
			if (root.left != null) {
				pre.s = root.left;
				pre = pre.s;
			}
			if (root.right != null) {
				pre.s = root.right;
				pre = pre.s;
			}
			root = root.s;
			if (root == null) {
				pre = dummyHead;
				root = dummyHead.s;
				dummyHead.s = null;
			}
		}
		return r;
	}

	public static void printByLevel(NodeBT root) {
		LinkedList<NodeBT> queue = new LinkedList<NodeBT>();
		queue.add(root);

		while (queue.size() != 0) {
			NodeBT temp = queue.poll();
			if (temp.s != null)
				System.out.print("[" + temp.val + " - " + temp.s.val + "]");
			else
				System.out.print("[" + temp.val + " - null]");

			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}

		}

	}

	public static void main(String[] args) {

//       	  1                  
//     	  /      \
//  	 2         3           
// 		/  \        \
//	  4      5       6       
///  /        \       \
//  7          8       9     

		NodeBT root1 = new NodeBT(1);
		NodeBT root2 = new NodeBT(2);
		NodeBT root3 = new NodeBT(3);
		NodeBT root4 = new NodeBT(4);
		NodeBT root5 = new NodeBT(5);
		NodeBT root6 = new NodeBT(6);
		NodeBT root7 = new NodeBT(7);
		NodeBT root8 = new NodeBT(8);
		NodeBT root9 = new NodeBT(9);
		root1.left = root2;
		root1.right = root3;
		root2.left = root4;
		root2.right = root5;
		root3.right = root6;
		root4.left = root7;
		root5.right = root8;
		root6.right = root9;

		printByLevel(root1);
		link_the_tree(root1);
		System.out.println();
		printByLevel(root1);
	}

}
