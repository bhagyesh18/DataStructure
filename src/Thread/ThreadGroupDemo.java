package Thread;

import com.sun.webkit.ThemeClient;

public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup threadGroup=new ThreadGroup("Thread Group-Patel");
		DisplayMessage dm=new DisplayMessage("Hello Bhagyesh");
		Thread t1=new Thread(threadGroup,dm,"one");
		t1.start();
		Thread t2=new Thread(threadGroup,dm,"two");
		t2.start();
		Thread t3=new Thread(threadGroup,dm,"three");
		t3.start();
		System.out.println(threadGroup.getName());
		threadGroup.list();
		
		Thread.sleep(14000);
		System.out.println(threadGroup.isDestroyed());
		
	}

}
