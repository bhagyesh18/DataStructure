package Random;

public class Random {

	public static void main(String[] args) {
	
		// math.random() return 0.0>=   <1.0 vaulues
		
		System.out.println(Math.round(Math.random()*10)); // returns 0-9
		System.out.println(Math.round(Math.random()*30)); // returns 0-29
		
		// 21 - 40              math.random()
		// Math.random()*(40-21+1)+21
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.round(Math.random()*(40-21+1)+21));
		}
		
		// 75 - 80              math.random()
				// Math.random()*(40-21+1)+21
	    for (int i = 0; i < 10; i++) {
			System.out.println(Math.round(Math.random()*(80-75)+75));
	   }
	    //1-100
		for (int i = 0; i < 10000; i++) {
			if((Math.round(Math.random()*100)+1)==100)
				System.out.println(100);
			System.out.println(Math.round(Math.random()*100)+1);
		}
	 
		   //1-100
				for (int i = 0; i < 10; i++) {
					System.out.println(Math.round(Math.random()*40)+1);
				}
		
	}

}
