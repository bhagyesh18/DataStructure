package Sorting;

public class InsertionSort {

	public static int[] InsertionSort(int[] a) {
		int j;
		int temp;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			j=i-1;
			while( j>=0 && temp<a[j]) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		
		return a;
	}
	
	public static void main(String[] args) {

		int[] a= {2,3,5,2,8,34,5,1,7};
		a=InsertionSort(a);
		for(int n:a) {
			System.out.println(n);
		}
		
	}

}
