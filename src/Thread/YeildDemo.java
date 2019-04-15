package Thread;

//Java program to illustrate yield() method 
//in Java 
import java.lang.*; 

//MyThread extending Thread 
class MyThread extends Thread 
{ 
	public void run() 
	{ 
		for (int i=0; i<5 ; i++) 
			System.out.println(Thread.currentThread().getName() 
								+ " in control"); 
	} 
} 

//Driver Class 
public class YeildDemo 
{ 
	public static void main(String[]args) 
	{ 
		MyThread t = new MyThread();
		t.setName("BHAGYESH");
		t.start(); 
try{
	t.setPriority(Thread.MAX_PRIORITY);
		for (int i=0; i<100; i++) 
		{ 
			// Control passes to child thread 
			Thread.yield(); 
				
			// After execution of child Thread 
			// main thread takes over 
			System.out.println(Thread.currentThread().getName() 
								+ " in control"); 
			
		}
}catch(Exception ex){
	
}
	} 
} 

