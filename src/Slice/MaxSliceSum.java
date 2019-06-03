package Slice;
// codility maxSliceSum
public class MaxSliceSum {

	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        int maxEnd=0;
	        int maxSlice=0;
	        for(int i=0;i<A.length;i++){
	            if(maxEnd+A[i]>0){
	                maxEnd=maxEnd+A[i];
	            }else{
	                maxEnd=0;   
	            }
	            if(maxEnd<maxSlice){
	                maxSlice=maxSlice;
	            }else{
	                maxSlice=maxEnd;   
	            }
	        }
	      
	      return maxSlice;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
