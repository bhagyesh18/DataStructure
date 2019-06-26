package Practice;

import java.util.Scanner;

public class ClockAngel {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int h,m;
		System.out.println("Enter Hours :");
		h=scanner.nextInt();
		System.out.println("Enter Min :");
		m=scanner.nextInt();
		
		  
		    if (h == 12) h = 0;  
		    if (m == 60) m = 0;  
		    int hour_angle = (int) (((h * 30) + (m/2)));  
		    System.out.println(hour_angle);
		    int minute_angle = 6 * m;
		    System.out.println(minute_angle);
		    int angle = Math.abs(hour_angle - minute_angle);  
		    angle = Math.min(360 - angle, angle);  
		    System.out.println(angle);
		
		
	}

}
