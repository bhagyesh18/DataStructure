package PreffixSum;

public class MinAvgTwoSlice {

	public static int solution(int[] A) {
		double min=0;
		int minPos=0;
		
		// Check first two elements 
		min=(A[0]+A[1])/2.0;
		
		// check two pairs (if total elements are even) and three pairs(if total elements are odd) 
		for(int i=0;i<A.length-2;i++) {
			if(((A[i]+A[i+1])/2.0)<min) {
				min=((A[i]+A[i+1])/2.0);
				minPos=i;
			}
			if(((A[i]+A[i+1]+A[i+2])/3.0)<min) {
				min=((A[i]+A[i+1]+A[i+2])/3.0);
				minPos=i;
			}
		}
		
		if(A[A.length-1]+A[A.length-2]<min) {
			min=(A[A.length-1]+A[A.length-2])/2;
			minPos=A.length-2;
		}
		
	
		
//		
//		def solution(A):
//		    min_avg_value = (A[0] + A[1])/2.0   # The mininal average
//		    min_avg_pos = 0     # The begin position of the first
//		                        # slice with mininal average
//		    for index in xrange(0, len(A)-2):
//		        # Try the next 2-element slice
//		        if (A[index] + A[index+1]) / 2.0 < min_avg_value:
//		            min_avg_value = (A[index] + A[index+1]) / 2.0
//		            min_avg_pos = index
//		        # Try the next 3-element slice
//		        if (A[index] + A[index+1] + A[index+2]) / 3.0 < min_avg_value:
//		            min_avg_value = (A[index] + A[index+1] + A[index+2]) / 3.0
//		            min_avg_pos = index
//		    # Try the last 2-element slice
//		    if (A[-1]+A[-2])/2.0 < min_avg_value:
//		        min_avg_value = (A[-1]+A[-2])/2.0
//		        min_avg_pos = len(A)-2
//		    return min_avg_pos
		
		
		
		
		
		
		
		return minPos;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {4, 2, 2, 5, 1, 5, 8};
		System.out.println(""+solution(A));
		
	}

}
