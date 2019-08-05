package Graph;

import java.util.Stack;

public class SumBetweenNodes {

	
	 static int  ans;
	    public static int rangeSumBST(TreeNode root, int L, int R) {
	        ans = 0;
	        dfs(root, L, R);
	        return ans;
	    }

	    public static void dfs(TreeNode node, int L, int R) {
	        if (node != null) {
	            if (L <= node.val && node.val <= R)
	                ans += node.val;
	            if (L < node.val)
	                dfs(node.left, L, R);
	            if (node.val < R)
	                dfs(node.right, L, R);
	        }
	    }
	    
	    

	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(15);
		root.left=new TreeNode(9);
		root.left.right=new TreeNode(13);
		root.left.left=new TreeNode(7);
		root.right=new TreeNode(21);
		root.right.left=new TreeNode(19);
		root.right.right=new TreeNode(23);
		System.out.println(rangeSumBST(root, 9, 15));
	
	}

}
