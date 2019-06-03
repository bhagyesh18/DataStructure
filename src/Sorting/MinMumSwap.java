package Sorting;

// Array [4,3,2,1]
// Return minimum swap operation need to do for sorting the array
// N=Array size
// Element of array 1<=A[i]<=N   For Ex. N=5 [1,2,3,4,5]

public class MinMumSwap {

	public static int minSwap(int[] arr) {
		int swap=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				int actualPos=0;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==i+1) {
						actualPos=j;
						break;
					}
				}
				int temp=arr[i];
				arr[actualPos]=arr[i];
				arr[i]=temp;
				swap++;		
			}
		}
		return swap;
	}
	
	public static void main(String[] args) {
		int[] A= {2, 4, 5, 1, 3};
		System.out.println(minSwap(A));
		
	}

}
