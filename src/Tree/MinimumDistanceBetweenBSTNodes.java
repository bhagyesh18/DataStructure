package Tree;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
public class MinimumDistanceBetweenBSTNodes {

	  static int  min = Integer.MAX_VALUE;
	  static long  prev = Long.MAX_VALUE;
	  public static int minDiffInBST(TreeNode root) {
	         if(root==null) return min;
	          minDiffInBSTRec(root);
	          return min;
	  }
	      
	      
	  public  static  void minDiffInBSTRec(TreeNode root)
	  {
	      if(root!=null){
	          minDiffInBSTRec(root.left);
	          if(min>Math.abs(prev-root.val)){
	              min = (int) Math.abs(prev-root.val);
	          }
	          prev = root.val;
	          minDiffInBSTRec(root.right);
	      }
	  }
		
	public static void main(String[] args) {
		
		
//		
//		   4
//	        /   \
//	      2      6
//	     / \    
//	    1   3  
	    
	    TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		root.left.right=new TreeNode(8);
		root.left.left=new TreeNode(2);
		root.right=new TreeNode(15);
		System.out.println( minDiffInBST(root));
		System.out.println();
		//preorderTraversal(root);
		
	}

}
