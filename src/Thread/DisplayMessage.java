package Thread;

public class DisplayMessage implements Runnable {
	 private String message;
	   
	   public DisplayMessage(String message) {
	      this.message = message;
	   }
	   
	   public void run() {
	     int i=10;
		   while(i>0) {
			      i--; 
			    try {
			    	  System.out.println(message);
			    	Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}    
	      }
	   }
}
