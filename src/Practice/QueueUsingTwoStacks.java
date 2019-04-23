package Practice;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	static Stack<Integer> stack1=new Stack<Integer>();
	static Stack<Integer> stack2=new Stack<Integer>();
	
	static void enqueue(int val) {
		stack1.add(val);
	}
	
    static int denqueue() {
    	if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			stack2.add(stack1.pop());
    		}
    	}
    	if(stack2.isEmpty()) {
    		return 0;
    	}
    	return stack2.pop();
	}
    
    static void print() {
    	if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			stack2.add(stack1.pop());
    		}
    	}
    	if(stack2.isEmpty()) {
    		return;
    	}
		System.out.println(stack2.peek());	
	    	
	}
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int q=scan.nextInt();
		while(q>0) {
			int op=scan.nextInt();
			if(op==1) {
				int val=scan.nextInt();
				enqueue(val);
			}else if(op==2) {
				denqueue();
			}else if(op==3) {
				print();
			}
			q--;
		}
		
		
	}

}
