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
					System.out.println(i*i);
				}else {
					factors+=2;
					System.out.println(i*i+">");
				}
			}
			i++;
		}

		return factors;
	}
	
	public static void main(String[] args) {
			System.out.println(solution(12));
	}

}
