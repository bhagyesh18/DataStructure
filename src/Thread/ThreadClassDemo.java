package Thread;

public class ThreadClassDemo {

		   public static void main(String [] args) {
		      Runnable hello = new DisplayMessage("Hello");
		      
		      Thread thread1 = new Thread(hello);
		      thread1.setDaemon(true);
		      thread1.setName("hello");
		      System.out.println("Starting hello thread...");
		      thread1.start();
		      
		      System.out.println("Starting thread3...");
		      Thread thread3 = new GuessANumber(27);
		      thread3.setName("Bhagyesh Thread");
		      thread3.start();
		      try {
		         thread3.join();
		      } catch (InterruptedException e) {
		         System.out.println("Thread interrupted.");
		      }
		  
		      System.out.println("Starting thread4...");
		      Thread thread4 = new GuessANumber(75);
		      
		      thread4.start();
		      System.out.println("main() is ending...");
		  
		      
		      Runnable rr= new DisplayMessage("bhagyesh Called ");
		      rr.run();
		      
		      GuessANumber ga=new GuessANumber(10);
		      ga.setName("BHagyesh new thread");
		      ga.start();
		      
		   }
}
