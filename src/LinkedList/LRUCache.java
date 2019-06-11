package LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class LRUNode{
    int key;
    int value;
    LRUNode prev;
    LRUNode next;
 
    public LRUNode(int key, int value){
        this.key=key;
        this.value=value;
    }
}

public class LRUCache {
		int capacity;
		int leastKey=0;
		LRUNode head;
		LRUNode tail;
	    Map<Integer, LRUNode> map=new HashMap<Integer, LRUNode>();
	    	
		public LRUCache(int capacity) {
	        
			this.capacity=capacity;
		}
	    
	    public int get(int key) {
	     System.out.println("get-"+key);   
	    	if(map.containsKey(key)) {
	     		LRUNode node=map.get(key);
	     		if(node.prev==null)
	     		    head=node.next;
	     		else
	     		    node.prev.next=node.next;
	     		
	     		if(node.next==null)
	     			tail=node.prev;
	     		else
	     			node.next.prev=node.prev;
	     		
	     		if(tail!=null)
	     			tail.next=node;
	     		
	     		node.prev=tail;
	     		node.next=null;
	     		tail=node;
	     		
	     		if(head==null)
	     			head=tail;
	     	
	     		print();
	     		return node.value;
	     	}
	    	
	    	return 1;
	    }
	    
	    public void print() {
	    	LRUNode first=head;
	    	while(first!=null) {
	    		System.out.print(" "+first.key);
	    		first=first.next;
	    	}
	    	System.out.println();
	    }
	    
	    
	    public void put(int key, int value) {
	    	
	     	if(map.containsKey(key)) {
	     		
	     		LRUNode node=map.get(key);
	     		node.value=value;
	     		if(node.prev==null)
	     		    head=node.next;
	     		else
	     		    node.prev.next=node.next;
	     		
	     		if(node.next==null)
	     			tail=node.prev;
	     		else
	     			node.prev.next=node.prev;
	     		
	     		if(tail!=null)
	     			tail.next=node;
	     		
	     		node.prev=tail;
	     		node.next=null;
	     		tail=node;
	     		
	     		if(head==null)
	     			head=tail;
	     		
	     		
	     	}else {
	     		if(map.size()==capacity) {
	     			map.remove(head.key);
	     			LRUNode node=head;	
	     			if(node.prev==null)
		     		    head=node.next;
		     		else
		     		    node.prev.next=node.next;
	     			
	     			
		     		if(node.next==null)
		     			tail=node.prev;
		     		else
		     			node.next.prev=node.prev;
		     		
	     		}
	     			LRUNode newNode=new LRUNode(key, value);
		     
	     			if(tail!=null)
		     			tail.next=newNode;
		     		
	     			newNode.prev=tail;
	     			newNode.next=null;
		     		tail=newNode;
		     		
		     		if(head==null)
		     			head=tail;
		     		
		     		map.put(key, newNode);
		     		
	     		
	     	}
	     	print();
	    }
	
	    public static void main(String[] args) {

	    	LRUCache lru=new LRUCache(3);
	    	lru.put(1, 1);
	    	lru.put(2, 2);
	    	lru.put(3, 3);
	    System.out.println(lru.get(1));
	    System.out.println(lru.get(2));
		  
	    System.out.println(lru.get(1));
			lru.put(4, 4);
	    	lru.put(5, 5);
	    	  System.out.println(lru.get(5));
	    	  System.out.println(lru.get(5));
	    	  System.out.println(lru.get(1));
	    	lru.put(6, 6);
	    	  System.out.println(lru.get(6));
	    	lru.put(7, 6);
	    		
	    	
	    }

}
