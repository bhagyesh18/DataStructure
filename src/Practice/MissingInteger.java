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
	   
	   
	   public static void main(String args[]) {
		 int[]  A = {1, 3, 6, 4, 1, 2}; 
    System.out.println(solution(A)); 
	   }
	   
}
