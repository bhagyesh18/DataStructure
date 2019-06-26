package Tree;

import Tree.TreeNode;

/*
 *   3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
 
 return true
 */



public class SubTree {

	//--------------- One method by PreOrder--------
	 public static boolean isSubtree(TreeNode s, TreeNode t) {
	        String tree1 = preorder(s, true);
	        String tree2 = preorder(t, true);
	        System.out.println(tree2);
	        System.out.println(tree1);
	        return tree1.indexOf(tree2) >= 0;
	    }
	    public static String preorder(TreeNode t, boolean left) {
	        if (t == null) {
	            if (left)
	                return "lnull";
	            else
	                return "rnull";
	        }
	        return "#"+t.val + " " +preorder(t.left, true)+" " +preorder(t.right, false);
	    }

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeNode root=new TreeNode(3);
			root.left=new TreeNode(4);
			root.left.right=new TreeNode(2);
			root.left.left=new TreeNode(1);
			root.right=new TreeNode(5);
			System.out.println(isSubtree(root, root.left));
			
			
		String name="bhagyeshpatel";
		System.out.println(name.indexOf("hatel"));
		
	}

}
