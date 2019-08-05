package Tree;


// leetcode
public class MergeTwoBinaryTree {

	  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        
	        if(t1==null && t2==null){
	            return t1;
	        }else if(t1==null && t2!=null){
	            return t2;
	        }else if(t1!=null && t2==null){
	            return t1;
	        }else{
	            t1.val+=t2.val;
	        }
	      
	        if(t1.left!=null && t2.left!=null){
	            mergeTrees(t1.left, t2.left);
	        }else if(t1.left==null && t2.left!=null){
	            t1.left=t2.left;
	        }else if(t1.left!=null && t2.left==null){
	            
	        }
	        
	        if(t1.right!=null && t2.right!=null){
	            mergeTrees(t1.right, t2.right);
	        }else if(t1.right==null && t2.right!=null){
	            t1.right=t2.right;
	        }else if(t1.right!=null && t2.right==null){
	            
	        }
	        
	        return t1;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
