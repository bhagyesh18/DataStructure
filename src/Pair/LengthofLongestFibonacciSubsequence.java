package Pair;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LengthofLongestFibonacciSubsequence {

	public static int solution(int[] A) {
		Set<Integer>  set=new HashSet<Integer>();
		for (int intVal : A) {
			set.add(intVal);
		}
		
		int MAX=0;
		for (int i = 0; i < A.length-MAX; i++) {
			int j=i+1;
			while(j<A.length) {
				  int x = A[j], y = A[i] + A[j];
	                int length = 2;
	                while (set.contains(y)) {
	                    int tmp = y;
	                    y += x;
	                    x = tmp;
	                    MAX = Math.max(MAX, ++length);
	                }
	                j++;
				}
		}
		
		return MAX;
	}
	
	public static void main(String[] args) {
		int[] A= {2,4,5,6,7,8,11,13,14,15,21,22,34};
		System.out.println(solution(A));
		
	
	}

}
