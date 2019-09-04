package Collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


class BTNode {
	int key;
	BTNode left, right;

	public BTNode(int key) {
		this.key = key;
		left = right = null;
	}

	public void PrintTree(BTNode root) {
		if (root != null) {
			System.out.print(" [" + root.key + "] ");
			PrintTree(root.left);
			PrintTree(root.right);
		}
	}

	
	public boolean search(BTNode root,int key) {
		if(root==null) {
			return false;
		}else {
			LinkedList<BTNode> queue=new LinkedList<BTNode>();
			queue.add(root);
			
			while(queue.size()!=0) {
				
				BTNode latest=queue.poll();
				if(latest.key==key) {
					return true;
				}
				if(latest.left!=null) {
				  queue.add(latest.left);
				}
				if(latest.right!=null) {
					queue.add(latest.right);
				}
			}
			
		}
		return false;
		
	}
	
	// It is not ordered tree as it is not Binary Search Tree
	public int findMax(BTNode root) {
		if (root == null) {
			return 0;
		}
		int current = root.key;
		int leftVal = findMax(root.left);
		int rightVal = findMax(root.right);
		if (current < leftVal) {
			current = leftVal;
		}
		if (current < rightVal) {
			current = rightVal;
		}
		return current;
	}

	
	// Same as BST
	public int heightTree(BTNode root) {
		if(root==null) {
			return 0;
		}else {
			
			// Put this code to make index 0
//			 if(root.left==null && root.right==null){
//	                return 0;
//	            }
			
			int l=heightTree(root.left);
			int r=heightTree(root.right);
			
			if(l>r) {
				return l+1;
			}else {
				return r+1;
			}
		}
		
	}
	
	
	// root index is 0 , so this function is different than above example
	public int height(BTNode root) {
      	int l=0;
        int r=0;
        if(root==null){
            return 0;
        }else{
            if(root.left==null && root.right==null){
                return 0;
            }

            if(root.left!=null){
                l+=height(root.left);
            }

            if(root.right!=null){
                r+=height(root.right);
            }

            if(l<r){
                return r+1;
            }else{
                return l+1;
            }

        }

    }
		
	public int countLeafNodes(BTNode root) {
		int count=0;
		if(root==null) {
			return 0;
		}else if(root.left==null && root.right==null) {
			return 1;
		}
		
		count+=countLeafNodes(root.left);
		count+=countLeafNodes(root.right);
		return count;
	}
	
	public void printLeafNodes(BTNode root) {
	       if(root==null) {
	    	   return;
	       }else if(root.left==null && root.right==null) {
	     	   System.out.print(" [" +root.key+ "] ");
	       }
	       printLeafNodes(root.left);
	       printLeafNodes(root.right);
	}
	
	
	public int numberOfNodes(BTNode root) {
		int count=1;
		
		if(root==null) {
			return 0;
		}else {
			count+=numberOfNodes(root.left);
			count+=numberOfNodes(root.right);
		}
		return count;
	}
	
	
	public int count2ChildNodes(BTNode root) {
		int count=0;
		if(root==null) {
			return 0;
		}else if(root.left!=null && root.right!=null) {
			count+=1;
		}
		count+=count2ChildNodes(root.left);
		count+=count2ChildNodes(root.right);
		return count;
	}
	
	public void print2ChildNodes(BTNode root) {
		if(root==null) {
			return;
		}else if (root.left!=null && root.right!=null) {
			System.out.print(" ["+root.key+"] ");
		}
		print2ChildNodes(root.left);
		print2ChildNodes(root.right);
	}
	
	
	public void printByLevel(BTNode root,int D,int level) {
		if(root==null) {
			return ;
		}
		if(D==level) {
			System.out.print(" " +root.key+" ");
		
		}else {
			printByLevel(root.left, D,  level+1);
			printByLevel(root.right, D,  level+1);
		}
	}
	
	
	// Print key each level
	public static void levelOrder(BTNode root) {
        LinkedList<BTNode> queue=new LinkedList<BTNode>();
        if(root==null){
            return ;
        }
        queue.add(root);
        while(queue.size()!=0){
           	BTNode temp=queue.poll();
             System.out.print(temp.key+" ");
             if(temp.left!=null)
                 queue.add(temp.left);
             if(temp.right!=null)
                queue.add(temp.right);
        }
    }
  
	
	
	public int count1ChildNodes(BTNode root) {
		int count=0;
		if(root==null) {
			return 0;
		}else if((root.left !=null && root.right==null) || (root.left ==null && root.right!=null)) {
			return 1;
		}
		count+=count1ChildNodes(root.left);
		count+=count1ChildNodes(root.right);
		return count;
	}
	
	public void print1ChildNodes(BTNode root) {
		if(root==null) {
			return;
		}else if((root.left !=null && root.right==null) || (root.left ==null && root.right!=null)) {
			System.out.print(" " +root.key+" ");
		}
		print1ChildNodes(root.left);
		print1ChildNodes(root.right);
	}
	
	
	public int getLevelByKey(BTNode root,int level,int key) {
		if(root==null) {
			return 0;
		}
		if(key==root.key) {
			return level;
		}else {
			int val=getLevelByKey(root.left, level+1, key);
			if(val==0) {
			}else {
				return val;
			}
			int val1=getLevelByKey(root.right, level+1, key);
			if(val1==0) {
			}else {
				return val1;
			}
			return 0;
		}
	}
	
	
	// number of nodes are even
	public boolean isevenTree(BTNode root) {
		if(root!=null) {
			if(isevenTree(root.left) == isevenTree(root.right)) {
				return false;
			}else {
				return true;
			}
		}
		return true;
	}
	
	
	  public BTNode invertTree(BTNode root) {
          
	         if(root==null)
	             return root;
	            
	         invertTreeRed(root);
	        
	         return root;
	        
	    }
	    
	    
	     public void invertTreeRed(BTNode root) {
	            
	         if(root==null)
	             return;
	        
	         BTNode left=root.left;
	         BTNode right=root.right;
	         root.left=right;
	         root.right=left;
	        
	         invertTree(root.left);
	         invertTree(root.right);
	    }
	
	     
	     public void printParentOfNode(BTNode root, BTNode node) {
	    	 Map<BTNode,BTNode> mapParent=new HashMap<BTNode, BTNode>();
	    	 mapParent.put(node,null);
	    	 mapParentsNodeDFS(root, mapParent);
	    	
		    	while(node!=null) {
		    		System.out.println(node.key);
		    		node=mapParent.get(node);
		    	}
	    	 
	    	 
	     }
	     public void mapParentsNodeDFS(BTNode root,Map<BTNode, BTNode> mapParent) {
	    	 if(root==null) {
	    		 return;
	    	 }
	    	 if(root.left!=null) {
	    		 mapParent.put(root.left,root);
	    		 mapParentsNodeDFS(root.left, mapParent);
	    	 }
	    	 if(root.right!=null) {
	    		 mapParent.put(root.right,root);
	    		 mapParentsNodeDFS(root.right, mapParent);
	    	 }	 
	     }
	 
	     
	  
	     
	
}

public class BinaryTreeDemo {

	public static void main(String[] args) {

		
	System.out.println("           8                 ");   
	System.out.println("    3                 9       ");     
	System.out.println("52     14       1            ");  
		
	System.out.println("");  
	
	
		BTNode bt = new BTNode(8);
		bt.left = new BTNode(3);
		bt.right = new BTNode(9);
		bt.left.left = new BTNode(52);
		bt.left.right = new BTNode(14);
		bt.right.left = new BTNode(1);
		System.out.print("Printing : ");
		bt.PrintTree(bt);
		System.out.println();
	
		System.out.println("Search "+bt.search(bt,7));
				
		System.out.println("Max Element is "+bt.findMax(bt));
		System.out.println("Count Lead Nodes :"+ 	bt.countLeafNodes(bt));
		System.out.print("Lead Nodes  are ");
		bt.printLeafNodes(bt);
		System.out.println(" \nTotal number of  Nodes :"+ 	bt.numberOfNodes(bt));
		System.out.println("Count Nodes with 2 children :"+ 	bt.count2ChildNodes(bt));
		System.out.print("Nodes with 2 children : ");
		bt.print2ChildNodes(bt);
		System.out.print("\nPrint By Level  Level 2 : ");
		bt.printByLevel(bt, 2,1);
		System.out.println();
		System.out.println("Height of Tree is :"+bt.heightTree(bt));
		
		System.out.println("Count Nodes with 1 children :"+ 	bt.count1ChildNodes(bt));
		System.out.print("Nodes with 1 children : ");
		bt.print1ChildNodes(bt);
		
		System.out.println("\nGet level for key getLevelByKey(bt,1,14) :"+ 	bt.getLevelByKey(bt, 1, 14));
		System.out.println("is Even Tree :"+ 	bt.isevenTree(bt));
		
		bt.printParentOfNode(bt, bt.left.right);
		
		
/*		
		
        8                 
 3                 9       
52     14       1            

Printing :  [8]  [3]  [52]  [14]  [9]  [1] 
Max Element is 0
Count Lead Nodes :3
Lead Nodes  are  [52]  [14]  [1]  
Total number of  Nodes :6
Count Nodes with 2 children :2
Nodes with 2 children :  [8]  [3] 
Print By Level  Level 2 :  3  9 
Height of Tree is :3
Count Nodes with 1 children :1
Nodes with 1 children :  9 
Get level for key getLevelByKey(bt,1,14) :3
is Even Tree :true
		
	*/	
		
		
	}

}
