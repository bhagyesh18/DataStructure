package Practice;

import java.util.Arrays;

public class SmallestRange {

	public static int smallestRange(int[] A,int K) {
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if(A[i]>K)
				A[i]=A[i]-K;
			else if(A[i]<K)
				A[i]=K;
			else
				A[i]=K;
		}
		if(A.length==1)
			return A[0];
		return A[1]-A[0]; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,35,12};
		int K = 3;
		System.out.println(smallestRange(A, K));
		
	}

}
