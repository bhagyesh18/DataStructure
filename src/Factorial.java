import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		System.out.println(factorial(13));
		
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
