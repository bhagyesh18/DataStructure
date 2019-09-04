package Collection;

import java.util.Iterator;
import java.util.LinkedList;

import sun.java2d.Disposer.PollDisposable;

// https://javaconceptoftheday.com/java-linkedlist-programming-examples/

public class LinkedListCol {

	public static void main(String args[]) {
		LinkedList ll=new LinkedList();
		ll.add("Bhagyesh");
		ll.add("Patel");
		ll.add("Kumat");
		ll.add("Shah");
		

		
		System.out.println(ll);
		
		ll.addFirst("Helll");
		ll.add("Hell");
		ll.add(2, "Sid");
		System.out.println(ll);
		
		Iterator iterato=ll.descendingIterator();
		while(iterato.hasNext()) {
			System.out.println(iterato.next());
		}
		
		ll.poll();
		System.out.println(ll);
			
		ll.removeFirstOccurrence("");
		ll.removeLastOccurrence("");
		ll.remove();
		ll.push("");
		ll.poll();
		ll.pollFirst();
		ll.pollLast();
		ll.pop();
	
		ll.clear();
		
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
     
        //Cloning the linkedList1 into linkedList2
        linkedList2 = (LinkedList<Integer>) ll.clone();
        
        
        
		
		
	}
	
}
