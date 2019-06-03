package Slice;

// codilit maxProfit

// Important

// [10,12,3,2,6]   
// get max profit from days in stock
// A and B days in array 0<=A<=B<N  Arr[B]-Arr[A]=profit find max profit
// in above case 10-12=2 3-6=3   max profit is 3
// efficient algorithm

public class MaxProfit {

	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        
	        if(A.length==0 || A.length==1){
	            return 0;
	        }
	        int max=0;
	        int min=A[0];
	        for(int i=1;i<A.length;i++){
	            if(A[i]>min){
	                if((A[i]-min)>max){
	                    max=A[i]-min;
	                }    
	            }else{
	                min=A[i];
	            }
	        }
	        return max;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ab=-2;
		double cd=-2;
			System.out.println(""+ab/cd);
			int a=-9;
			int b=-20;
			System.out.println(""+Math.multiplyExact(a, b));
			
			
	}

}
