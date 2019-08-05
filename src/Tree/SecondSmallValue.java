package Tree;


//leet   Tree is special root.val is min value of root.left and root.right
//Second Minimum value In a Binary Tree
public class SecondSmallValue {

	    int min1=1;
	    long min2=Long.MAX_VALUE;
	    public int findSecondMinimumValue(TreeNode root) {
	        min1=root.val;
	        dfs(root);
	        return (min2==Long.MAX_VALUE)?-1:(int)min2;
	    }
	    public void dfs(TreeNode root){
	        if(root==null)
	            return;
	      
	        if(min1<root.val && root.val<min2)
	            min2=root.val;
	              
	        if(root.left!=null){
	            dfs(root.left);
	        }
	        if(root.right!=null){
	            dfs(root.right);
	        }
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
