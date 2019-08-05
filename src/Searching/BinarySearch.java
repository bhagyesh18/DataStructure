package Searching;

public class BinarySearch {

	public static int binarySearch(int a[],int key) {
		int first=0;
		int last=a.length-1;
		int mid=last/2;
		while(first<=last){
			if(a[mid]<key) {
				first=mid+1;
			}else if (a[mid]==key) {
				return mid;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,3,8,12,16,20,30,40,60};
		int res=binarySearch(arr, 16);
		if(res==-1) {
			System.out.print("Element is not available in the Array");
		}else {

			System.out.print("Element Poistion "+(res+1));
		}
	}

}
