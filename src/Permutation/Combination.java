package Permutation;

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
			combination(6, 3);
	}

}
