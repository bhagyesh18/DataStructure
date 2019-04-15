import java.util.Scanner;

/*
 * 
 * Write a java program to find the largest number ‘L’ less than a given number ‘N’ which 
 * should not contain a given digit ‘D’. For example, If 145 is the given number and 4 is the given digit, 
 * then you should find the largest number less than 145 such that it should not contain 4 in it. 
 * In this case, 139 will be the answer. This program is one of the logical programs in java. [Solution]
 */
public class LargestNumberinDigit {

	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int exceptNum=scan.nextInt();
		
		char c=Integer.toString(exceptNum).charAt(0);
		int i;
		for(i=num;i>0;i--) {
			if(Integer.toString(i).indexOf(c)==-1) {
				break;
				
			}
			
		}
		
		System.out.println("Answer is :"+i);
		
		// Check Each digits
		int a=190234;
		char[] chara=Integer.toString(a).toCharArray();
		for(char cha:chara) {
			System.out.println(cha);
		}
		
		
		
	}
	
}
