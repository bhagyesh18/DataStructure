package Searching;

public class LinerarSequentialSearch {

	public static int LineraSearch(int[] arr,int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main (String args[]) {
		
		int[] arr= {1,2,4,345,45,12,7,34,23,8,34,23,7};
		int res=LineraSearch(arr, 34);
		if(res==-1) {
			System.out.print("Element is not available in the Array");
		}else {

			System.out.print("Element Poistion "+(res+1));
		}
		
		
	}
	
}
