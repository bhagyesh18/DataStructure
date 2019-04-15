package Collection;



public class LinkedListTry {
	
	static int a=0;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	static void printLinked(Node head){
		Node save=head;
		while(save!=null) {
			System.out.println(save.data);
			save=save.next;
		}
	}
	
	public static void main(String args[]) {
		Node head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node last=new Node(4);
		head.next=second;
		second.next=third;
		third.next=last;
		LinkedListTry.printLinked(head);
		
		
	}
	
	
	
}
