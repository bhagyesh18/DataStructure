package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.omg.CORBA.INTERNAL;

// leet code
public class LCAoFTree {

	// use search This is for Binary Search Tree 
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        
     	if(root==null) {
			return root;
		}else {
			TreeNode current=root;
			while(current!=null) {
				if(current!=null) {
					if(current.val>p.val && current.val>q.val) {
				        current=current.left;
					}else if (current.val<p.val && current.val<q.val) {
						current=current.right;
					}else{
                     return current;
                 }
				}
				if(current==null) {
					return null;
				}
			}
			
			return current;
		}
	 }
     
	 
	 
	 // What if it is the binary tree 
	 // It tough to find the solution 
	 
	 public TreeNode lowestCommonAncestorBinaryTree(TreeNode root, TreeNode p, TreeNode q) {
		 this.ancestor=null;
		 return ancestor;		 
	 }
	 
	 public TreeNode ancestor;
	 public boolean recursiveDFS(TreeNode root, TreeNode p, TreeNode q) {
		 if(root==null)
			 return false;
		 
		 int left=(recursiveDFS(root.left, p, q))?1:0;
		 int right=(recursiveDFS(root.right, p, q))?1:0;
		 
		 int mid=(root==p || root==q)?1:0;
			 
		 if((left+right+mid)>=2) {
			 this.ancestor=root;	
		 }
		 
		 return ((left+right+mid)>0);
		 
		 
	 }
	
	 // For Binary Tree 
	 // Same complexity 
	  public TreeNode lowestCommonAncestorSETMAP(TreeNode root, TreeNode pNode, TreeNode qNode) {

		        LinkedList<TreeNode> stack = new LinkedList<>();
		        java.util.Map<TreeNode, TreeNode> parent = new HashMap<>();

		        parent.put(root, null);
		        stack.push(root);

		        while (!parent.containsKey(pNode) || !parent.containsKey(qNode)) {

		            TreeNode node = stack.pop();

		            if (node.left != null) {
		                parent.put(node.left, node);
		                stack.push(node.left);
		            }
		            if (node.right != null) {
		                parent.put(node.right, node);
		                stack.push(node.right);
		            }
		        }

		        Set<TreeNode> ancestors = new HashSet<>();

		        while (pNode != null) {
		            ancestors.add(pNode);
		            pNode = parent.get(pNode);
		        }

		      
		        
		        while (!ancestors.contains(qNode))
		            qNode = parent.get(qNode);
		        return qNode;
		    }

	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
