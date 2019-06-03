package GCDLCM;

//https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/

public class GCD {

	static int findGCD(int a,int b) {
		if(a==0) {
			return b;
		}
		
		if(b==0) {
			return a;
		}
		
		if(a==b) {
			return a;
		}
		
		if(a>b) {
		return	findGCD(a-b, b);
		}else {
		return	findGCD(a, b-a);
		}
		 
	}
	
	//Efficient way
		static int findGCDEuclidean(int a,int b) {
			if(b==0) {
				return a;
			}
			return findGCDEuclidean(b, a%b);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(""+ findGCD(10, 2));
		System.out.println(""+ findGCDEuclidean(0, 19));
	}

}
