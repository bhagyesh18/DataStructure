package Sorting;

//https://javaconceptoftheday.com/java-program-to-implement-selection-sort/

public class SelectionSort {

	public static int[] selectionSort(int array[]) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		
		
		return array;
	}
	
	public static int[] selectionSort2(int aa[]) {
		int temp;
		for(int i=0;i<aa.length;i++) {
			for(int j=i+1;j<aa.length;j++) {
				if(aa[j]<aa[i]) {
					temp=aa[i];
					aa[i]=aa[j];
					aa[j]=temp;
					System.out.println("i:"+i+"J:"+j);
					for(int n:aa) {
						System.out.print(n+" ");
					}
					System.out.println();
				}
			}
		}
		
		return aa;
	}
	
	public static void main(String[] args) {
		int a[]= {3,345,2,90,2,43,89};
		a=selectionSort2(a);
		for(int n:a) {
			System.out.println(n);
		}
		
	}

}
