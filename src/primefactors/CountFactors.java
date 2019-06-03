package primefactors;

// Codility

public class CountFactors {

	public static int solution(int N) {
		int factors=0;
		int i=1;
	
		while(i*i<=N) {
			if(N%i==0) {
				if(i*i==N) {
					factors+=1;
				}else {
					factors+=2;
				}
			}
			i++;
		}
		
		return factors;
	}
	
	public static void main(String[] args) {
			System.out.println(solution(24));
	}

}
