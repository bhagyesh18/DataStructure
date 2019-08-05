package Leader;

import java.util.*;
/*
 * 
 * This is a demo task.
// codility MissingInteger   may have negative and positive, return greater than 0 value
 * 
 * leetcode also but range is 0,1,2,...n
 */

public class MissingInteger {
	   public static int solution(int[] A) {
		      int N=A.length;
		      Set<Integer> set=new HashSet<Integer>();
		      for(int n:A){
		         if(n>0)
		            set.add(n);
		      }
		      
		      for(int i=1;i<=N+1;i++){
		            if(!set.contains(i)){
		                return i;
		            }   
		      }
		      return 1;
		    }
	   
	   
	   
	   // o(n) // codility
	   public static int solutionLinear(int[] A) {
		      int N=A.length;
		      int min=-1;
		      int max=-1;
		      int oneindex=0;
		      
		      for(int i=0;i<N;i++){
		    	
		    	  if(A[i]==1) {
		    		  oneindex=1;
		    	  }
		    	  
		         if(A[i]==min) 
		        	 min=-1;
		         if(A[i]==max) 
		        	 max=-1;
		         
		         if(min==-1 && oneindex==1 && A[i]-1!=1 && A[i]-1!=max && A[i]<=N && A[i]>1)
		        	 min=A[i]-1;

		         if(max==-1 && A[i]<=N && A[i]>=1)
		        	 max=A[i]+1;
		          
		      }
		      if(min!=-1) {
			      return min;
		      } else if (max!=-1) {
			      return max;
		      }else {
			      return 0;  
		      }
		      
		    }
	   
	   
	   // leetcode simple because we know the length and range
	   //   N(N+1)/2
	   public static int findmissingGaussAlgoMath(int[] A) {
		   int expectedSum=A.length*(A.length+1)/2;
		   int actualSum=0;
		   for (int i : A) {
			  actualSum+=i;
		   }
		   return expectedSum-actualSum;
	   }
	   
	   
	   // leetcode using XOR opeartion 
	   public static int findmissingXOR(int[] A) {
		   int missing = A.length;
	        for (int i = 0; i < A.length; i++) {
	            missing ^= i ^ A[i];
	        }
	        return missing;
	   }
	   
	   
	   public static void main(String args[]) {
		 int[]  A = {3,4,1}; 
		 System.out.println(solution(A)); 
		 System.out.println(solutionLinear(A)); 
		 int[]  B = {3,4,1,0}; 
		 System.out.println(findmissingGaussAlgoMath(B));

		 System.out.println(findmissingXOR(B));
	   }
	   
}
