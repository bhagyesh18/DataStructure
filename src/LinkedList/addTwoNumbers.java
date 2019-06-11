package LinkedList;

import java.math.BigDecimal;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class addTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String firstop = "";
		String lastop = "";
		ListNode first = l1;
		int catchzero = l1.val;
		firstop = first.val + firstop;
		first = first.next;
		while (first != null) {
			if (catchzero == first.val && catchzero == 0) {
				catchzero = first.val;
			} else {
				firstop = first.val + firstop;
				first = first.next;
				if (first != null)
					catchzero = first.val;
			}

		}

		ListNode last = l2;
		catchzero = l2.val;
		lastop = last.val + lastop;
		last = last.next;
		while (last != null) {

			if (catchzero == last.val && catchzero == 0) {
				catchzero = last.val;
			} else {
				lastop = last.val + lastop;
				last = last.next;
				if (last != null)
					catchzero = last.val;
			}

		}
		long total = Long.parseLong(firstop) + Long.parseLong(lastop);

		System.out.println(total);
		ListNode result = new ListNode(0);
		ListNode current = new ListNode(0);
		int i = 0;
		while (total != 0) {
			if (i == 0) {

				System.out.println((int) total % 10);
				ListNode newNode = new ListNode((int) total % 10);
				result = newNode;
				current = result;
				i++;
			} else {
				ListNode newNode = new ListNode((int) total % 10);
				current.next = newNode;
				current = current.next;
			}

			total = total / 10;

		}

		return result;
	}

	public static void main(String[] args) {
		
		
	}

}
