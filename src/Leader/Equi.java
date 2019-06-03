package Leader;

public class Equi {

	public static int solution(int A[], int N) {
	    long left_sum = 0;
	    long right_sum = 0;
	    int i, j;
	    for (i = 0; i < N; i++) {
	        // Calculate sum of the left part
	        left_sum = 0;
	        for (j = 0; j < i; j++) {
	           left_sum = Math.addExact(left_sum, A[j]);
	        }
	        right_sum = 0;
	        for (j = i+1; j < N; j++) {
	        	right_sum=Math.addExact(right_sum, A[j]);	
	        }
	        if (left_sum == right_sum) {
	            return i;
	        }
	    }
	    return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A=new int[8];
		 A[0] = -1;
				  A[1] =  3;
				  A[2] = -4;
				  A[3] =  5;
				  A[4] =  1;
				  A[5] = -6;
				  A[6] =  2;
				  A[7] =  1;
		
		int[] B={0, -2147483648, -2147483648};
		
		System.out.println(solution(A, A.length));
		
		System.out.println(solution(B, B.length));
		
		System.out.println( );
		
		char c='a';
		int a='a';
		System.out.println(a);
		
		String s="bHHQWGUSFBH";
		char[] w=s.toCharArray();
		
		
	}

}
