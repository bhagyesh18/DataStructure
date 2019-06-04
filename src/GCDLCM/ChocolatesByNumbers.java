package GCDLCM;

// codility

// Important

public class ChocolatesByNumbers {
	 public static int gcd(int N,int M) {
		  if(M==0) {
			  return N;
		  }
		  return gcd(M,N%M);
	}
	public static int lcd(int N,int M) {
		  return (N*M)/gcd(N,M);
	}
	
	public static int solution(int N, int M) {
	     return lcd(N,M)/M;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10, 3));
		
	}

}
