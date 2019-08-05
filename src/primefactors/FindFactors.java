package primefactors;

public class FindFactors {

	public static void findFactorsOfNumber(int N) {
			
		int i=2;
		while(i<=Math.sqrt(N)) {
			if((N%i)==0 && (N/i)*i==N) {
				System.out.println(i+" "+(N/i));
			}
			i++;
		}
//		output
//		2 25
//		5 10
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			findFactorsOfNumber(502);
	}

}
