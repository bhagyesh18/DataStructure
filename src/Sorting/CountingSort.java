package Sorting;

import java.util.Arrays;

//https://www.geeksforgeeks.org/counting-sort/
// usefull when values in array in range 20-50 but not range from 1 to n2? because it increase the complexity to n2


public class CountingSort {

	public static int[] sorting(int[] arr) {
		
		int max=Arrays.stream(arr).max().getAsInt();
		int min=Arrays.stream(arr).min().getAsInt();
		int[] count=new int[max-min+1];
		int[] output=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]-min]++;
		}
		for(int i=1;i<count.length;i++) {
			count[i]+=count[i-1];
		}
		for(int i=arr.length-1;i>=0;i--) {
			output[count[arr[i]-min]-1]=arr[i];
			count[arr[i]-min]--;
		}
		for (int i = 0; i < output.length; i++) {
			arr[i]=output[i];
		}
		return arr;
	}

	public static String sortingString(String str) {
		char[] charArr=str.toCharArray();
		int[] count=new int[256];
		char[] output=new char[str.length()];
		
		for(int i=0;i<charArr.length;i++) {
			count[charArr[i]]++;
		}
		for(int i=1;i<count.length;i++) {
			count[i]+=count[i-1];
		}
		for(int i=charArr.length-1;i>=0;i--) {
			output[count[charArr[i]]-1]=charArr[i];
			count[charArr[i]]--;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<output.length;i++) {
			sb.append(output[i]);
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A= {1,3,5,2,1,9,7};
		A=sorting(A);
		System.out.println(Arrays.toString(A));
	
		System.out.println(sortingString("bhagyeshbhpaatell"));	
		
	}

}
