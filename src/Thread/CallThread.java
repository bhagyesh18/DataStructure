package Thread;
public class CallThread{
	
	
	
	public static void main(String[] args) {
	
		GuessANumber guessNumber=new GuessANumber(12);
		guessNumber.setName("GS-1");
		guessNumber.start();
		
		
		GuessANumber guessNumber2=new GuessANumber(12);
		guessNumber2.setName("GS-2");
		guessNumber2.start();
		
		try {
		 	guessNumber2.join();
		} catch (InterruptedException e) {
	
		}
		
		GuessANumber guessNumber3=new GuessANumber(12);
		guessNumber3.setName("GS-1");
		guessNumber3.start();
		
		
		
		
	}
	
	
	
	
}