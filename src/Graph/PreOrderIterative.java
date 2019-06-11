package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
 
 // PreOrder Traverse using iterative method
// Use DFS method for this > Check root then left then right node.

public class PreOrderIterative {

	public static List<Integer> preorderTraversal(TreeNode root) {
		 List<Integer> result=new ArrayList<Integer>();
			if(root==null)
	            return result;
	        
	        
	        Stack<TreeNode> stack=new Stack<TreeNode>();
			stack.add(root);
			System.out.print(" "+root.val);
	        
					result.add(root.val);
			List<TreeNode> visited=new ArrayList<TreeNode>();
			visited.add(root);
			while(stack.size()!=0) {
				TreeNode firstRoot=stack.peek();
				while(firstRoot.left!=null && !visited.contains(firstRoot.left)) {
					stack.add(firstRoot.left);
					visited.add(firstRoot.left);
					firstRoot=firstRoot.left;
					result.add(firstRoot.val);
					System.out.print(" "+firstRoot.val);
				}
				TreeNode rightNode=stack.pop();
				if(rightNode.right!=null) {
					visited.add(rightNode.right);
					stack.add(rightNode.right);
					result.add(rightNode.right.val);
					System.out.print(" "+rightNode.right.val);
				}
			}
			
			return result;
    }
	
	public static void preOrderRec(TreeNode root) {
		if(root==null){
			return;
		}
		System.out.print(" "+root.val);
		preOrderRec(root.left);
		preOrderRec(root.right);
	}
	
	public static void main(String[] args) {
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(4);
		root.left.right=new TreeNode(6);
		root.left.left=new TreeNode(2);
		root.left.left.right=new TreeNode(3);
		root.left.left.left=new TreeNode(1);
		root.right=new TreeNode(7);
		root.right.left=new TreeNode(8);
		root.right.right=new TreeNode(19);
		root.right.left.right=new TreeNode(43);
		root.right.left.right.left=new TreeNode(5);
		
		preOrderRec(root);
		System.out.println();
		preorderTraversal(root);
		
	}

}
