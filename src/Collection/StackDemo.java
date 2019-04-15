package Collection;

class Stack{
	
	int MAX;
	int[] s;
	int top=-1;
	
	public Stack(int size) {
			MAX=size;
			s=new int[MAX];
	}
	
	public void push(int v) {
		if(top==MAX-1) {
			System.out.println("Stack is Full");
		}else {
			top++;
			s[top]=v;
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is Underflow");
		}else {
			top--;
		}
	}
	
	public void printtop() {
			if(top<MAX && top>=0) {
				System.out.println("TOP :"+s[top]);
			}else {
				System.out.println("Stack is Empty");
			}
	}
	
	
	
}

public class StackDemo {

	public static void main(String[] args) {
			Stack stack=new Stack(10);
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.printtop();
			stack.pop();
			stack.printtop();
			

	}

}
