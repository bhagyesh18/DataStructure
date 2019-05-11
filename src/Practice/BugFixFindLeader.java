package Practice;

/*
 * 
 * A non-empty array A consisting of N integers and sorted in a non-decreasing 
 * order (i.e. A[0] ≤ A[1] ≤ ... ≤ A[N−1]) is given. The leader of this array 
 * is the value that occurs in more than half of the elements of A.

You are given an implementation of a function:

def solution(A)

that, given a non-empty array A consisting of N integers, 
sorted in a non-decreasing order, returns the leader of array A. 
The function should return −1 if array A does not contain a leader.

For example, given array A consisting of ten elements such that:

  A[0] = 2
  A[1] = 2
  A[2] = 2
  A[3] = 2
  A[4] = 2
  A[5] = 3
  A[6] = 4
  A[7] = 4
  A[8] = 4
  A[9] = 6
the function should return −1, because the value that occurs most frequently in 
the array, 2, occurs five times, and 5 is not more than half of 10.
 */

public class BugFixFindLeader {

	
	public static int findLeader(int[] A) {
		
		int len=A.length;
		int pos=len/2;
		int middlevalue=A[pos-1];
		int counter=0;
		for(int i=0;i<A.length;i++) {
			if(middlevalue==A[i]){
				counter++;
			}
		}
		
		if(counter>=pos) {
			return middlevalue;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] A=new int[10];
		          A[0] = 2;
				  A[1] = 2;
				  A[2] = 2;
				  A[3] = 2;
				  A[4] = 2;
				  A[5] = 3;
				  A[6] = 4;
				  A[7] = 4;
				  A[8] = 4;
				  A[9] = 6;
		
			System.out.println(findLeader(A));	  
				  
	}

}
