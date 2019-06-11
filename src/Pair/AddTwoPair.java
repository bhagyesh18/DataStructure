package Pair;

import java.util.HashSet;
import java.util.Set;

// Find pair of element which has specified sum.
// Complexity should be O(n)

public class AddTwoPair {
	public static boolean solution(int[] A,int key) {
	    Set<Integer> set=new HashSet<Integer>();
	    for (int i = 0; i < A.length; i++) {
				int diff=key-A[i];
				if(set.contains(diff)) {
					System.out.println("Diff" + diff +" "+A[i]);
				}
				set.add(A[i]);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] A= {5,10,12,0,18,-6,-6,14,2,89};
		System.out.println(solution(A,-12));
		
		StringBuffer sb=new StringBuffer(String.valueOf(101));
		if(String.valueOf(101).equals(sb.reverse().toString())) {
			System.out.println("Yes");
		}
		
	}

}
