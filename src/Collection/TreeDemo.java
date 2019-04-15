package Collection;

class TNode{
	int key;
	TNode left,right;
	
	public TNode(int key) {
		this.key=key;
		left=right=null;
	} 
	
	public void PrintTree(TNode root) {
		if(root!=null) {
			System.out.println(root.key);
		    PrintTree(root.left);
		    PrintTree(root.right);
		}
	}
	
}

public class TreeDemo {

	public static void main(String[] args) {
		TNode root=new TNode(1);
		root.left=new TNode(2);
		root.right=new TNode(3);
		root.PrintTree(root);
		
	}

}
