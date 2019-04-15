package HackerRank;

import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TopViewTree {

	static class Pair { 
	    Node first; 
	    int second; 
	    Pair(Node n,int a) 
	    { 
	        first=n; 
	        second=a; 
	    } 
	};
	
	/* 
    
    
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
		// Base case 
	    if (root == null) { 
	        return; 
	    } 
	  
	    // Take a temporary node 
	    Node temp = null; 
	  
	    // Queue to do BFS 
	    Queue<Pair > q =  new LinkedList<Pair>(); 
	  
	    // map to store node at each vartical distance 
	    Map<Integer, Integer> mp = new HashMap<Integer, Integer>(); 
	  
	    q.add(new Pair( root, 0 )); 
	  
	    // BFS 
	    while (q.size()>0) { 
	  
	        temp = q.peek().first; 
	        int d = q.peek().second; 
	        q.remove(); 
	  
	        // If any node is not at that vertical distance 
	        // just insert that node in map and print it 
	        if (mp.get(d) == null) { 
	            System.out.print( temp.data + " "); 
	            mp.put(d, temp.data); 
	        } 
	  
	        // Continue for left node 
	        if (temp.left!=null) { 
	            q.add(new Pair( temp.left, d - 1 )); 
	        } 
	  
	        // Continue for right node 
	        if (temp.right!=null) { 
	            q.add(new Pair( temp.right, d + 1 )); 
	        } 
	    } 
    }
	
	
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}