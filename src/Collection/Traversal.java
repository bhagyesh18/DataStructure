package Collection;

/*
 * PRE  Root - LEft - right 
 * POS  left - right -root 
 * IN   left - root -right 
 * 
 * 
 */

class PrePostInNode {
	int key;
	PrePostInNode left, right;

	public PrePostInNode(int key) {
		this.key = key;
		left = right = null;
	}
	
	// Root left right 
	public  void preorder(PrePostInNode root) {
		
		if(root==null) {
			return;
		}
		System.out.print("["+root.key+"]");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	// Left right root 
	public void postorder(PrePostInNode root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print("["+root.key+"]");
	}
	
	// left root right 
	public void inorder(PrePostInNode root) {
		if(root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print("["+root.key+"]");
		inorder(root.right);
	}
}
public class Traversal {

	public static void main(String[] args) {
		
		System.out.println("           8                 ");   
		System.out.println("    3                 9       ");     
		System.out.println("52     14       1            ");  
			
		System.out.println("");  
		
		
		    PrePostInNode bt = new PrePostInNode(8);
			bt.left = new PrePostInNode(3);
			bt.right = new PrePostInNode(9);
			bt.left.left = new PrePostInNode(52);
			bt.left.right = new PrePostInNode(14);
			bt.right.left = new PrePostInNode(1);
		
			System.out.println("PreOrder");  
			bt.preorder(bt);
			System.out.println("\nPost ORder");  
			bt.postorder(bt);
			System.out.println("\nIn order");  
			bt.inorder(bt);
			System.out.println("");  
			
	}

}
