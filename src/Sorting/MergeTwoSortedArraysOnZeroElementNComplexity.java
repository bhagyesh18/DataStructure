package Sorting;
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

	 public static void merge(int[] A, int m, int[] B, int n) {
		 
	        if(B.length==0){
	            return;
	        }
	        int in=m-1;
	        for(int i=A.length-1;m!=0 && i>=0;i--){
	                if(in<0){
	                      A[i]=0;    
	                }else{
	                    A[i]=A[in];
	                    in--;
	                }
	        }
	        
	        
	        int i=A.length-m;
	        int j=0;
	        int ind=0;
	        while(j<B.length && i<A.length){
	             if(A[i]==B[j]){
	                A[ind]=A[i];
	                ind++;
	                A[ind]=A[i];
	                ind++;
	                i++;
	                j++;
	            } else if(A[i]<B[j]){
	                A[ind]=A[i];
	                i++;
	                ind++;
	            }else{
	                A[ind]=B[j];
	                ind++;
	                j++;     
	            }    
	        }
	        while(ind<A.length && j<B.length){
	            A[ind]=B[j];
	            ind++;
	            j++;
	        }
	 }

}

