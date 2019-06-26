package Practice;

import java.util.*;
/*
 * 
 * This is a demo task.
// codility MissingInteger
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
	   
	   
	   
	   // o(n)
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
		         
		        System.out.println(min+" "+max);	 
		      }
		      if(min!=-1) {
			      return min;
		      } else if (max!=-1) {
			      return max;
		      }else {
			      return 0;  
		      }
		      
		    }
	   
	   
	   public static void main(String args[]) {
		 int[]  A = {6,4,7,89,2,3}; 
		 System.out.println(solution(A)); 
		 System.out.println(solutionLinear(A)); 
	   }
	   
}
