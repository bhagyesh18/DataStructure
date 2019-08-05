package Slice;
import java.util.Arrays;

public class MergeTwoSortedArraysOnZeroElementNComplexity {
	 public static void main(String [] args) {
	  
		 int[] nums1 = {1,3,200,0,0,0};
	     int[] nums2 = {2,5,6};
	     int m = 3;
	     int n = 3;
	     
	     merge(nums1, m, nums2, n);
	     
	     System.out.println(Arrays.toString(nums1));

	 }

	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	         int i=nums1.length-1;
	         int j=nums1.length-1;
	         
	         // shift all non-zero elements to at the end of the array
	         for (i = nums1.length-1; i >= 0; i--)  
	         { 
	             if (nums1[i] != 0)  
	             { 
	                 nums1[j] = nums1[i]; 
	                 j--; 
	             } 
	         } 
	         i=nums1.length-m;
	         int ind=0;
	         j=0;
	         
	         // merge two array by comparision
	         while(j<nums2.length){
	         
	        	 if(i<nums1.length && nums1[i]<nums2[j]) {
	        		nums1[ind]=nums1[i];
	        		ind++;
	        		i++;
	        	 }else if (i<nums1.length && nums1[i]<nums2[j]) {
	        		 nums1[ind]=nums1[i];
	        		 ind++;
	        		 nums1[ind]=nums1[i];
	        		 ind++;
	        		 j++;
	        	 }else {
	        		 nums1[ind]=nums2[j];
	        		 j++;ind++;
	        	 }
	         }
	 }

}

