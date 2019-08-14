package Thread;

// https://www.javatpoint.com/creating-thread

// In case of Runnable object
//If you are not extending the Thread class,your class object would not be treated as a thread object.So you need to 
//explicitely create Thread class object.We are passing the object of your class 
//that implements Runnable so that your class run() method may execute.
public class CallRunnable {

	public static void main(String[] args) {
		
//		Runnable r1=new DisplayMessage("bhagyesh");
//		r1.run();  
//		Runnable r2=new DisplayMessage("shga");
//		r2.run();
//		
		// if you use run() directly it does not create Thread object as you are not extending the Thread
		// so if you call run() directly it run as normal object, it will finish the execution of the first run()
		// then second run() 
		// so to take benefit of threading use, Create Thread object and call start method.
		
		
		Runnable r1=new DisplayMessage("bhagyesh");
		new Thread(r1).start();
		
		Runnable r2=new DisplayMessage("shga");
		new Thread(r2).start();
		
		
	}

}
