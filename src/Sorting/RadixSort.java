package Sorting;

import java.util.Arrays;

//https://www.geeksforgeeks.org/radix-sort/
public class RadixSort {

	public static int[] sorting(int[] arr) {
		int max=Arrays.stream(arr).max().getAsInt();
		for(int exp=1;max/exp>0;exp*=10)
			countSort(arr,arr.length,exp);
		
		return arr;
	}
	
	public static int[] countSort(int[] arr, int n,int exp) {

		int[] count=new int[10];
		int[] output=new int[n];
		for(int i=0;i<arr.length;i++)
				count[(arr[i]/exp)%10]++;

		for(int i=1;i<count.length;i++)
				count[i]+=count[i-1];
		
		for(int i=arr.length-1;i>=0;i--) {
			output[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for (int i = 0; i < output.length; i++) {
			arr[i]=output[i];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] A= {1,303,5,11032,93,7,23,741};
		A=sorting(A);
		System.out.println(Arrays.toString(A));
		//[1, 5, 7, 23, 93, 303, 741, 11032]


		
		
	}

}
