package Tree;

import java.util.LinkedList;

import sun.font.StrikeCache;

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
		
	  
	  public static void bfs(TreeNode root) {
		  if(root==null) {
			  return;
		  }
		  LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
		  queue.add(root);
		  
		  while(!queue.isEmpty()) {
			  TreeNode temp=queue.poll();
			  System.out.print(" "+temp.val);
			  
			  if(temp.left!=null) {
				  queue.add(temp.left);
			  }
			  if(temp.right!=null) {
				  queue.add(temp.right);
			  }
		  }
	  }
	  
	  
	  public static void dfs(TreeNode root) {
		  if(root==null) {
			  return;
		  }
		  
		  System.out.print(" "+root.val);
			  if(root.left!=null) {
				 dfs(root.left);
			  }
			  if(root.right!=null) {
					 dfs(root.right);
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
		
		StringBuffer sb=new StringBuffer("fasdfsafsfsdasdg");
		sb.insert(2, '-');
		System.out.println(sb);
		String name="---";
		name=name.replaceAll("-","");
		System.out.println(name.length());
		
		bfs(root);
		dfs(root);
	}

}
