package Tree;

// https://leetcode.com/problems/n-ary-tree-preorder-traversal/submissions/
// should be iterative 
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class PreOrderTreeByListChild {

	 // My solution takes more time and space 
	 public List<Integer> mypreorder(Node root) {
	        List<Integer> result=new ArrayList<Integer>();
	        
	        if(root==null)
	            return result;
	        
	        Stack<Node> stack=new Stack<Node>();
	        List<Node> visited=new ArrayList<Node>();
	        
	        result.add(root.val);
	        visited.add(root);
	        stack.add(root);
	        
	        while(stack.size()!=0){
	            List<Node> child=stack.peek().children;
	            if(child.size()==0){
	                stack.pop();
	                continue;
	            }
	            boolean allchildvisited=true;
	            for(Node node:child){
	                if(!visited.contains(node)){
	                    stack.add(node);
	                    result.add(node.val);
	                    visited.add(node);
	                    allchildvisited=false;
	                    break;
	                }
	            }
	            if(allchildvisited==true){
	                stack.pop();
	            }
	         
	        }
	        
	        return result;
	        
	    }
	 
	 // fast solution
	 public List<Integer> fastiterativepreorder(Node root) {
	        List<Integer> result=new ArrayList<Integer>();
	        
	        if(root==null)
	            return result;
	        
	        Stack<Node> stack=new Stack<Node>();
		    stack.add(root);
	        
	        while(!stack.isEmpty()) {
	        	Node temp=stack.pop();
	        	result.add(temp.val);
	        	for(int i=temp.children.size()-1;i>=0;i--) {
	        		stack.add(temp.children.get(i));
	        	}
	        	
	        }
	        return result;
	    }
	   
	 
	 	// Recursive but easy
	 	List<Integer> result=new ArrayList<Integer>();
	    public List<Integer> fastrecusrsivepreorder(Node root) {
	        
	        if(root==null)
	            return result;
	        
	        result.add(root.val);
	        for(Node node: root.children)
	        	fastrecusrsivepreorder(node);
	                
	        return result;
	    }
	 
	public static void main(String[] args) {
		
	}

}
