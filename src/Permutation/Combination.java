package Permutation;

/*
 * Permutation : It is the different arrangements of a given number of elements taken one by one, 
 * or some, or all at a time. For example, if we have two elements A and B, then there are two possible arrangements, 
 * AB and BA. Number of permutations when ‘r’ elements are arranged out of a total of ‘n’ elements is n Pr = n! / (n – r)!. 
 * For example, let n = 4 (A, B, C and D) and r = 2 (All permutations of size 2). The answer is 4!/(4-2)! = 12.
The twelve permutations are AB, AC, AD, BA, BC, BD, CA, CB, CD, DA, DB and DC.
Combination : It is the different selections of a given number of elements taken one by one, or some, or all at a time. 
For example, if we have two elements A and B, then there is only one way select two items, we select both of them.
Number of combinations when ‘r’ elements are selected out of a total of ‘n’ elements is n C r = n! / [ (r !) x (n – r)! ]. 
For example, let n = 4 (A, B, C and D) and r = 2 (All combinations of size 2). The answer is 4!/((4-2)!*2!) = 6. The six 
combinations are AB, AC, AD, BC, BD, CD.
 */

public class Combination {

	
	  public static  void combination(int n,int subset){
		  
		 int[] data=new int[subset];
		 int[] arr=new int[n];
		 for (int i = 1; i <=n; i++) {
			arr[i-1]=i;
		}
		 combinationRec(arr, data, 0, n-1, 0, subset);
	        
	  }
	  public static void combinationRec(int[] arr,int[] data, int start,int end, int index,int subset) {
		  
		  if(index==subset) {
			  for (int i = 0; i < data.length; i++) {
				  	System.out.print(data[i]+" ");
		    	}
			  System.out.println();
			  return;
		  }
		  
		  for (int i = start; i <= end  && end-i+1>= subset-index ; i++) {
			  data[index]=arr[i];
			  combinationRec(arr, data, i+1, end, index+1, subset);
		  }
	  }
	  
	  
	public static void main(String[] args) {
			combination(6, 2);
			// 1*2*3*4*5*6
	}

}
