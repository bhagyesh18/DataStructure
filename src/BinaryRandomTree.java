class TreeNode
{
    int data;
    TreeNode left, right;
    public TreeNode(int item)
    {
        data = item;
        left = right = null;
    }
}
 
class BinaryRandomTree
{
    TreeNode root;
    public BinaryRandomTree()
    {
        root = null;
    }
    void printLevelOrder()
    {
        int h = getHeight(root);
        int i;
        for (i=1; i<=h; i++){
        	System.out.print("Depth :"+(i-1) +" => ");
            printGivenLevel(root, i);
            System.out.println();
            }
    }
 
    int getHeight(TreeNode root)
    {
        if (root == null)
           return 0;
        else
        {
            int l = getHeight(root.left);
            int r = getHeight(root.right);
             
            if (l > r)
                return(l+1);
            else return(r+1); 
        }
    }
 
    void printGivenLevel (TreeNode root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
     
    public static void main(String args[])
    {
       BinaryRandomTree tree = new BinaryRandomTree();
       tree.root= new TreeNode(10);
       tree.root.left= new TreeNode(6);
       tree.root.right= new TreeNode(9);
       tree.root.left.left= new TreeNode(14);
       tree.root.left.right= new TreeNode(35);
       tree.printLevelOrder();
    }
}