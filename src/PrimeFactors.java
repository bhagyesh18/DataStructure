

//https://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/
public class PrimeFactors {

	static void findPrimeFactors(int n) {
		
		while(n%2==0) {
			System.out.print(" 2");
			n=n/2;
		}
		
		for(int i=3;i<=Math.sqrt(n);i++) {
			while(n%i==0) {
				System.out.print(" "+i);
				n=n/i;
			}
		}
		
		if(n>2) {
			System.out.print(" "+n);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			findPrimeFactors(36);
			System.out.println("");
			findPrimeFactors(30);
	}

}
