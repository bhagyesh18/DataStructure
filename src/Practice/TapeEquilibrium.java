package Practice;

/*
 * 
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.

Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: 
A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:

P = 1, difference = |3 − 10| = 7 
P = 2, difference = |4 − 9| = 5 
P = 3, difference = |6 − 7| = 1 
P = 4, difference = |10 − 3| = 7 
Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:

  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
 */

public class TapeEquilibrium {

	public static int solution(int[] A) {

	    long sumright = 0;
	    long sumleft = 0;
	    long ans;

	    for (int i =1;i<A.length;i++)
	        sumright += A[i];

	    sumleft = A[0];
	    ans =Math.abs(Math.abs(sumright)+Math.abs(sumleft));

	    for (int P=1; P<A.length; P++)
	    {
	        if (Math.abs(Math.abs(sumleft) - Math.abs(sumright))<ans)
	            ans = Math.abs(Math.abs(sumleft) - Math.abs(sumright));
	        sumleft += A[P];
	        sumright -=A[P];
	    }
	    return (int) ans;  
	    
	    
	    // MY SOLUTION is time consuming 
	    /*
	     * 
	     *  int P=A.length-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<P;i++){
        
            int leftSum=0;
            for(int j=0;j<=i;j++){
                leftSum=Math.addExact(leftSum, A[j]);
            }
            int rightSum=0;
            for(int j=i+1;j<A.length;j++){
                rightSum=Math.addExact(rightSum, A[j]);
            }
            int dif=Math.abs(Math.subtractExact(leftSum, rightSum)); 
            if(dif<min){
                min=dif;
            } 
        }
       
       return min; 
	     */
	    
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 1, 2, 4, 3}));
		System.out.println(solution(new int[] { 3, 1}));
		System.out.println(solution(new int[] { -3, -1, -2, -4, -3}));
		System.out.println(solution(new int[] { -3, -1, -2, 4, 3}));
	}

}
