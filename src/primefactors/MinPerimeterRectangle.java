package primefactors;

// codility

public class MinPerimeterRectangle {
	public static int solution(int N) {
		int factors=0;
		int i=1;
		int key=N;
		factors=2*(i+N);
		i++;
		while(i<=(Math.sqrt(key))) {
			if(key%i==0 && ((key/i)*i==key)) {
				N=key/i;
				if(factors>(2*(N+i))) {
					factors=(2*(N+i));
					System.out.println(i+" "+N);
				}
			}
			i++;
		}
		return factors;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(solution(4564320));
	}

}
