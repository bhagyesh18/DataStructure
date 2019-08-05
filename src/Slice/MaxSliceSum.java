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
	            if(maxEnd>maxSlice){
	                maxSlice=maxEnd;   
	            }
	        }
	      return maxSlice;
	}
	
		// very fast must do
	    public static int maxSubArray(int[] nums) {
	        int sum=0,max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            sum+=nums[i];
	            if(sum>max)
	                max=sum;
	            if(sum<0)
	                sum=0;
	        }
	        return max;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={10,12,-30,45,2,61};
		System.out.println(solution(A));
		System.out.println(maxSubArray(A));
	}

}
