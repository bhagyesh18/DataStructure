package Stack;

class MyStack<T>{
	
	public static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data=data;
		}
	}
	
	StackNode<T> top;
	public void push(T data) {
		StackNode<T> newNode=new StackNode<T>(data);
		newNode.next=top;
		top=newNode;
	}
	
	public T pop() {
		if(isEmpty()) {
			return null;
		}else {
			StackNode<T> deleteNode=top;
			top=deleteNode.next;
			return deleteNode.data;
		}
	}
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}

	public T peek() {
		if(!isEmpty()) {
			return top.data;
		}
		return null;
	}
	
	
}



public class StackLinkGeneric {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<Integer> myStack=new MyStack<Integer>();
		myStack.push(12);
		myStack.push(33);
		myStack.push(54);
		myStack.push(35);
		System.out.println(myStack.peek());
		System.out.println("Popped : "+myStack.pop());
		System.out.println("Top :"+myStack.peek());
		System.out.println("Popped : "+myStack.pop());
		System.out.println("Top :"+myStack.peek());
	}

}
