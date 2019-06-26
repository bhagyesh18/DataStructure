package Collection;

class MyQueue<T> {
	
	public static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
		public QueueNode(T data) {
			this.data=data;
			this.next=null;
		}
	}
	
	QueueNode<T> first;
	QueueNode<T> last;
	
	public void insert(T data) {
		QueueNode<T> newNode=new QueueNode<T>(data);
		
		if(first==null && last==null) {
			last=first=newNode;
			return;
		}
		last.next=newNode;
		last=newNode;
//		if(last!=null) {
//			last.next=newNode;
//		}
//		last=newNode;
//		if(first==null) {
//			first=last;
//		}
	}
	
	public T delete() {
		if(first==null) {
			return null;
		}
		T data=first.data;
		first=first.next;
		if(first==null) {
			last=null;
		}
		return data;
	}
	
	public T peek() {
		if(!isEmpty()) {
			return first.data;
		}
		return null;
	}
	
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}
		return false;
	}
	
}

public class QueueLinkGeneric {
	
	public static void main(String[] args) {
			
			MyQueue<Integer> q=new MyQueue<Integer>();
			q.insert(12);
			q.insert(14);
			q.insert(15);
			q.insert(17);
			System.out.println(q.peek());
			q.delete();
			System.out.println(q.peek());
			q.delete();
			System.out.println(q.peek());
			
	}
	
}
