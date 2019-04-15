package Collection;

//class Queue{
//	int MAX;
//	int[] q;
//	int f,r;
//	public Queue(int size) {
//		MAX=size;
//		f=r=-1;
//		q=new int[MAX];
//	}
//	
//	public void insert(int value) {
//		if(r==MAX-1) {
//			System.out.println("Queue is full");
//		}else {
//			if(f==-1) {
//				f=0;
//			}
//			r=r+1;
//			q[r]=value;
//		}
//	}
//	
//	public void delete() {
//		if(f==-1 && f>r) {
//			System.out.println("Queue is underflow");
//		}else {
//			System.out.println("element is removed :"+q[f]);
//			f=f+1;
//			
//		}
//	}
//
//	public void display() {
//		if(f==-1) {
//			System.out.println("Queue is underflow");
//		}else {
//			for(int i=f;i<=r;i++) {
//				System.out.print(" |"+q[i]+"| ");
//			}
//			System.out.println();
//		}
//	}
//	
//}


// Queue shoudl be Circular 
class Queue{
	int[] q;
	int MAX;
	int currentSize;
	int f,r;
	
	public Queue(int capacity) {
		MAX=capacity;
		r=capacity-1;
		f=currentSize=0;
		q=new int[MAX];
	}
	
	public boolean isEmpty() {
		if(currentSize==0) 
			return true;
		else
			return false;
	    }
	
	public boolean isFull() {
		if(currentSize==MAX) 
			return true;
		else
			return false;
	}


	
	public void insert(int val) {
			if(isFull()) {
				System.out.println("Queue is Full");
			}else {
				this.r=(r+1)%MAX;
				q[r]=val;
				currentSize=currentSize+1;
			}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Delete Element is :"+q[f]);
			this.f=(f+1)%MAX;
			currentSize=currentSize-1;
		}
	}	
		
	public void front(){
		if(isEmpty()) {
			System.out.println("Empty");
		}
		else {
			System.out.println("Front Element" + q[f]);
		}
	}
	
	public void rear(){
		if(isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.println("Rear Element" + q[r]);
		}
	}
	

	public void display() {
	if(isEmpty()) {
		System.out.println("Queue is underflow");
	}else {
		
		if(f<r) {
			for(int i=f;i<=r;i++) {
				System.out.print(" |"+q[i]+"| ");
			}
				
		}else {
			for(int i=0;i<=r;i++) {
				System.out.print(" |"+q[i]+"| ");
			}	
			for(int i=f;i<=MAX-1;i++) {
				System.out.print(" |"+q[i]+"| ");
			}	
		}
		
		System.out.println();
	}
}
	
}


public class QueueDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue que=new Queue(5);
		que.insert(1);
		que.display();
		que.insert(2);
		que.display();
		que.insert(3);
		que.display();
		que.delete();
		que.display();
		que.insert(4);
		que.display();
		que.insert(5);
		que.display();
		que.delete();
		que.display();
		
		que.front();
		que.insert(6);
		que.display();
		que.front();
		que.rear();
		que.insert(20);
		que.display();
		que.front();
		que.rear();
		que.insert(1);
		que.display();
		que.front();
		que.rear();
	}

}
