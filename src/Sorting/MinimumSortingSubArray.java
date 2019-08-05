package Sorting;

import java.util.Stack;

public class MinimumSortingSubArray {

	
	// Suing stack T: n  S:n
	public static int findMinSortingSubArray(int[] A) {
		int leftPointer=A.length,rightPointer=0;
		Stack<Integer> stack=new Stack<Integer>();
		for (int i = 0; i < A.length; i++) {
			while(!stack.isEmpty() && A[stack.peek()]>A[i])
				leftPointer=Math.min(leftPointer, stack.pop());
			stack.add(i);
		}
		stack.clear();
		for (int i = A.length-1; i >=0; i--) {
			while(!stack.isEmpty() && A[stack.peek()]<A[i])
				rightPointer=Math.max(rightPointer, stack.pop());
			stack.add(i);
		}
		return rightPointer-leftPointer>0?rightPointer-leftPointer+1:0;
		
	}
	
	// Without Stack 
	 public static int findUnsortedSubarray(int[] nums) {
	        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	        boolean flag = false;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] < nums[i - 1])
	                flag = true;
	            if (flag)
	                min = Math.min(min, nums[i]);
	        }
	        flag = false;
	        for (int i = nums.length - 2; i >= 0; i--) {
	            if (nums[i] > nums[i + 1])
	                flag = true;
	            if (flag)
	                max = Math.max(max, nums[i]);
	        }
	        int l, r;
	        for (l = 0; l < nums.length; l++) {
	            if (min < nums[l])
	                break;
	        }
	        for (r = nums.length - 1; r >= 0; r--) {
	            if (max > nums[r])
	                break;
	        }
	        return r - l < 0 ? 0 : r - l + 1;
	    }
	
	public static void main(String[] args) {
		
		int[] A= {2,8,12,14,10,9,19};
		System.out.println(findMinSortingSubArray(A));
		
	}

}
