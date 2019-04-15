import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Factorial f=new Factorial();
		Scanner input=new Scanner(System.in);
		//int[] no;
		int size;
		size=input.nextInt();
		int[] no=new int[size];
		
		for(int i=0;i<size;i++){
			no[i]=input.nextInt();
		}
	
		
//foreach loop with list extract the individual item.
		for(int val : no){
			System.out.println("j="+val+" Result is : "+factorial(val));
			System.out.println("j="+val+" Result is : "+f.fac(val));
		}
		
	}
	
	
	
	
	public int fac(int n){
		int res=1;
		
		for(int i=2;i<=n;i++){
			res=res*i;
		}
		return res;
	}
	
	public static int factorialRec(int n) {
	       if (n == 0) {
	           return 1;
	       } else {
	           return n * factorialRec(n - 1);
	       }
	}
	
	public static int factorial(int n){
		int res=1;
		
		for(int i=2;i<=n;i++){
			res=res*i;
		}
		return res;
	}
	
}
