package Timer;
import java.util.Date;

public class Lot {
	static int counter=0;
	static Date lastTime;
	public static boolean validateRequest() {
		System.out.println("Time "+new Date());
		if(lastTime==null) {
			lastTime=new Date();
		}
		counter++;
		Date currentTime=new Date();
		if((currentTime.getTime()-lastTime.getTime())>1000) {
			counter=1;
			lastTime=new Date();
			return true;
		}
		
		if((currentTime.getTime()-lastTime.getTime())<1000 && counter<=3) {
			return true;
		}else if ((currentTime.getTime()-lastTime.getTime())<1000 && counter>3) {
		   return false;
		}
		return false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		Thread.sleep(1067);
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		Thread.sleep(1067);
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		System.out.println(validateRequest());
		System.out.println(validateRequest());
	}

}
