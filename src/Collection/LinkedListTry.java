package Collection;

public class LinkedListTry {

	static int a = 0;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node head;

	static Node insert(int key) {
		Node newNode = new Node(key);
		if (head == null) {
			head = newNode;
		} else {
			Node save = head;
			while (save.next != null) {
				save = save.next;
			}
			save.next = newNode;
		}
		return head;
	}

	
	// important leet
	  public Node reverseList(Node head) {
		  
	        if(head==null || head.next==null) return head;
	        Node returnHead=reverseList(head.next);
	        head.next.next=head;
	        head.next=null;
	        return returnHead;       
    }
	//or 
	public Node reverseIterative(Node head) {
        Node pre=null;
        Node save=head;
        while(save!=null){
           Node temp=save.next;
            save.next=pre;
            pre=save;
            save=temp;
        }
        return pre;
	}
	
	static void printLinked(Node head) {
		Node save = head;
		while (save != null) {
			System.out.println(save.data);
			save = save.next;
		}
	}

	public static void main(String args[]) {
		head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node last = new Node(4);
		head.next = second;
		second.next = third;
		third.next = last;
		insert(1000);
		
		LinkedListTry.printLinked(head);

	}

}
