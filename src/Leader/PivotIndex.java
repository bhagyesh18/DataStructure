package Leader;

//
//fid pivot index 
//1,7,3,6,5,6 = 6 
//11<6>11
public class PivotIndex {
	 public static int pivotIndex(int[] nums) {
	        int sum = 0, leftsum = 0;
	        for (int x: nums) sum += x;
	        for (int i = 0; i < nums.length; ++i) {
	            if (leftsum == sum - leftsum - nums[i]) return i;
	            leftsum += nums[i];
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,7,3,6,5,6 };
		System.out.println(pivotIndex(n));
	}

}
