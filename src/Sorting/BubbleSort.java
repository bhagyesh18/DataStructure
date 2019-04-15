package Sorting;

public class BubbleSort {
	
	public static void BubbleSortFun(int[] a) {
	
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<((a.length-i)-1);j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		int[] a= {2,3,5,2,8,34,5,1,7};
		BubbleSortFun(a);
		for(int n:a) {
			System.out.println(n);
		}
		
	}
}
