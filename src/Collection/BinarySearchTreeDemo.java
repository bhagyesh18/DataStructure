package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.print.attribute.standard.Finishings;



class BSTNode{
	int key;
	BSTNode left,right;
	
	public BSTNode(int key) {
		this.key=key;
		left=right=null;
	} 
	
	public void PrintTree(BSTNode root) {
		if(root!=null) {
			System.out.print(" ["+root.key+"] ");
		    PrintTree(root.left);
		    PrintTree(root.right);
		}
	}
	
	public BSTNode search(int key) {
		if(this.key==key) {
			return this;
		}else {
			BSTNode current=this;
			while(current.key!=key) {
				if(current!=null) {
					if(current.key>key) {
						current=current.left;
					}else {
						current=current.right;
					}
				}
				if(current==null) {
					return null;
				}
			}
			
			return current;
		}
		
	}
	
	public void insertBST(int key) {
		BSTNode newNode=new BSTNode(key);
		BSTNode current=this;
		BSTNode parent=current;
		while(true) {
			parent=current;
			if(key<parent.key) {
				current=parent.left;
				if(current==null) {
					parent.left=newNode;
					return;
				}
			}else {
				current=parent.right;
				if(current==null) {
					parent.right=newNode;
					return;
				}
			}
		}
	}
	
	// Most Right Element 
	public BSTNode findMax(BSTNode root) {
		
		BSTNode maxnode=root;
		if(maxnode!=null) {
			if(maxnode.right!=null) {
				maxnode=findMax(maxnode.right);
			}
		}
		return maxnode;
	}
	
	// Most Left Element
	public BSTNode minNodes(BSTNode root) {
		BSTNode current=root;
		if(current!=null) {
			if(current.left!=null) {
				current=minNodes(current.left);
			}
		}
		return current;
	}

	
	
	
	public int countLeafNodes(BSTNode root) {
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
	
	public void printLeafNodes(BSTNode root) {
	       if(root==null) {
	    	   return;
	       }else if(root.left==null && root.right==null) {
	     	   System.out.print(" [" +root.key+ "] ");
	       }
	       printLeafNodes(root.left);
	       printLeafNodes(root.right);
	}
	
	
	// BFS 
	// Print key each level
	public static void levelOrder(BSTNode root) {
	        LinkedList<BSTNode> queue=new LinkedList<BSTNode>();
	        
	        if(root==null){
	            return ;
	        }
	        queue.add(root);
	        while(queue.size()!=0){
	        	BSTNode temp=queue.poll();
	             System.out.print(temp.key+" ");
	             if(temp.left!=null)
	                 queue.add(temp.left);
	             if(temp.right!=null)
	                queue.add(temp.right);
	        }
	}
	  
	
	public int numberOfNodes(BSTNode root) {
		int count=1;
		
		if(root==null) {
			return 0;
		}else {
			count+=numberOfNodes(root.left);
			count+=numberOfNodes(root.right);
		}
		return count;
	}
	
	
	public int count2ChildNodes(BSTNode root) {
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
	
	public void print2ChildNodes(BSTNode root) {
		if(root==null) {
			return;
		}else if (root.left!=null && root.right!=null) {
			System.out.print(" ["+root.key+"] ");
		}
		print2ChildNodes(root.left);
		print2ChildNodes(root.right);
	}
	
	
	public void printByLevel(BSTNode root,int D,int level) {
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
	
	
	public int heightofTree(BSTNode root) {
	   
	   if(root==null) {
		   return 0;
	   }else{
		   int l=heightofTree(root.left);
		   int r=heightofTree(root.right);
		   
		   if(l>r) {
			   return l+1;
		   }else {
			   return r+1;
		   }
	   }
	}
	
	public int count1ChildNodes(BSTNode root) {
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
	
	public void print1ChildNodes(BSTNode root) {
		if(root==null) {
			return;
		}else if((root.left !=null && root.right==null) || (root.left ==null && root.right!=null)) {
			System.out.print(" " +root.key+" ");
		}
		print1ChildNodes(root.left);
		print1ChildNodes(root.right);
	}
	
	
	public int getLevelByKey(BSTNode root,int level,int key) {
		if(root==null) {
			return 0;
		}
		if(key==root.key) {
			return level;
		}else {
			int val=getLevelByKey(root.left, level+1, key);
			if(val!=0) {
		
				return val;
			}
			int val1=getLevelByKey(root.right, level+1, key);
			if(val1!=0) {
				return val1;
			}
			return 0;
		}
	}
	
	
	// number of nodes are even
	public boolean isevenTree(BSTNode root) {
		if(root!=null) {
			if(isevenTree(root.left) == isevenTree(root.right)) {
				return false;
			}else {
				return true;
			}
		}
		return true;
	}
	
	
	 boolean checkBST(BSTNode root) {
	       return ISBST(root,Integer.MIN_VALUE,10000);
	    }
	    boolean ISBST(BSTNode root,int min,int max){
	        if(root==null){
	            return true;
	        }
	        if(root.key<min || root.key >max){
	            return false;    
	        }
	        
	        return ISBST(root.left,min,root.key-1) && ISBST(root.right,root.key+1,max) ;
	   }
	
	    
	    static int  min = Integer.MAX_VALUE;
		  static long  prev = Long.MAX_VALUE;
		  public static int minDiffInBST(BSTNode root) {
		         if(root==null) return min;
		          minDiffInBSTRec(root);
		          return min;
		  }
		      
		      
		  public  static  void minDiffInBSTRec(BSTNode root)
		  {
		      if(root!=null){
		          minDiffInBSTRec(root.left);
		          if(min>Math.abs(prev-root.key)){
		              min = (int) Math.abs(prev-root.key);
		          }
		          prev = root.key;
		          minDiffInBSTRec(root.right);
		      }
		  }
	    
		  
		  private int sum=0;
		  public BSTNode convertToGreaterTreeRec(BSTNode root) {
		        if (root != null) {
		            convertToGreaterTreeRec(root.right);
		            sum += root.key;
		            root.key = sum;
		            convertToGreaterTreeRec(root.left);
		        }
		        return root;
		    }
		    
		    public BSTNode converttoGreaterTree(BSTNode root) {
		        int sum = 0;
		        BSTNode node = root;
		        Stack<BSTNode> stack = new Stack<BSTNode>();

		        while (!stack.isEmpty() || node != null) {
		            while (node != null) {
		                stack.add(node);
		                node = node.right;
		            }

		            node = stack.pop();
		            sum += node.key;
		            node.key = sum;

		            node = node.left;
		        }

		        return root;
		    }
		  
		  
}


public class BinarySearchTreeDemo {
		public static void main(String args[]) {
			BSTNode bsetTree=new BSTNode(8);
			bsetTree.insertBST(3);
			bsetTree.insertBST(19);
			bsetTree.insertBST(2);
			bsetTree.insertBST(6);
			bsetTree.insertBST(10);
			bsetTree.insertBST(29);
			System.out.print("Printing : ");
			bsetTree.PrintTree(bsetTree);
			System.out.println();
			
			BSTNode searchedNode=bsetTree.search(19);
			if(searchedNode!=null) {
				System.out.println("Searched Element is "+searchedNode.key);
			}else {
				System.out.println("Searched Element NOT FOund");
						
			}
		
		
			System.out.println("Max Element is "+bsetTree.findMax(bsetTree).key);
			System.out.println("Min Element is "+bsetTree.minNodes(bsetTree).key);
			System.out.println("Count Lead Nodes :"+ 	bsetTree.countLeafNodes(bsetTree));
			System.out.print("Lead Nodes  are ");
			bsetTree.printLeafNodes(bsetTree);
			System.out.println(" \nTotal number of  Nodes :"+ 	bsetTree.numberOfNodes(bsetTree));
			System.out.println("Count Nodes with 2 children :"+ 	bsetTree.count2ChildNodes(bsetTree));
			System.out.print("Nodes with 2 children : ");
			bsetTree.print2ChildNodes(bsetTree);
			System.out.print("Print By Level  Level 2 : ");
			bsetTree.printByLevel(bsetTree, 4,1);
			System.out.println();
			System.out.println("Height of Tree is :"+bsetTree.heightofTree(bsetTree));
			
			System.out.println("Count Nodes with 1 children :"+ 	bsetTree.count1ChildNodes(bsetTree));
			System.out.print("Nodes with 1 children : ");
			bsetTree.print1ChildNodes(bsetTree);
			
			System.out.println("\n get level for key getLevelByKey(bsettree,1,29) :"+ 	bsetTree.getLevelByKey(bsetTree, 1, 29));
		
		
			System.out.println("is Even Tree :"+ 	bsetTree.isevenTree(bsetTree));
			
			

			
			
			
			/*
			 * 
			 *                       8
			 *             3               19
			 *          2     6        10       29    
			 *          
			 * 
			 * Printing :  [8]  [3]  [2]  [6]  [19]  [10]  [29] 
Searched Element is 19
Max Element is 29
Min Element is 2
Count Lead Nodes :4
Lead Nodes  are  [2]  [6]  [10]  [29]  
Total number of  Nodes :7
Count Nodes with 2 children :3
Nodes with 2 children :  [8]  [3]  [19] Print By Level  Level 2 : 
Height of Tree is :3
Count Nodes with 1 children :0
Nodes with 1 children : 
 get level for key getLevelByKey(bsettree,1,29) :3

 is Even Tree :false

			 */
			
			
			
		}
	
}
