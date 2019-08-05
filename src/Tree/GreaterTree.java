package Tree;

import java.util.Stack;

public class GreaterTree {

	 private int sum = 0;

	    public TreeNode convertToGreaterTreeRec(TreeNode root) {
	        if (root != null) {
	            convertToGreaterTreeRec(root.right);
	            sum += root.val;
	            root.val = sum;
	            convertToGreaterTreeRec(root.left);
	        }
	        return root;
	    }
	    
	    public TreeNode converttoGreaterTree(TreeNode root) {
	        int sum = 0;
	        TreeNode node = root;
	        Stack<TreeNode> stack = new Stack<TreeNode>();

	        while (!stack.isEmpty() || node != null) {
	            while (node != null) {
	                stack.add(node);
	                node = node.right;
	            }

	            node = stack.pop();
	            sum += node.val;
	            node.val = sum;

	            node = node.left;
	        }

	        return root;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
