package Thread;


class RunnablethreadDemo implements Runnable {
	   private Thread t;
	   private String threadName;
	   
	   RunnablethreadDemo( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(5000);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void xyaz() {
		   
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	    	  
	    	 // This line actuall created Runnable object and invoke run method. 
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
}




public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RunnablethreadDemo R1 = new RunnablethreadDemo( "Thread-1");
	      R1.start();
	      
	      RunnablethreadDemo R2 = new RunnablethreadDemo( "Thread-2");
	      R2.start();
	      
	      GuessANumber gs=new GuessANumber(78);
	      gs.start();
	      
	      Runnable r1=()->System.out.println("hello");
	      r1.run();
	    
	}

}
