package Tree;


//https://leetcode.com/problems/trim-a-binary-search-tree/solution/
public class TrimTreeLR {

	 public static TreeNode trimBST(TreeNode root, int L, int R) {
	        if (root == null) return root;
	        if (root.val > R) return trimBST(root.left, L, R);
	        if (root.val < L) return trimBST(root.right, L, R);

	        root.left = trimBST(root.left, L, R);
	        root.right = trimBST(root.right, L, R);
	        return root;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(15);
		root.left=new TreeNode(9);
		root.left.right=new TreeNode(13);
		root.left.left=new TreeNode(7);
		root.right=new TreeNode(21);
		root.right.left=new TreeNode(19);
		root.right.right=new TreeNode(23);
		System.out.println(trimBST(root, 9, 15));
	}

}
