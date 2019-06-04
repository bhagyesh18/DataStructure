package Sorting;

public class QuickSort {
	public static int[] QuickSort(int[] a,int first,int last) {
		int pivot,i,j,temp;
		if(first<last) {
			// Pivot is fist element
			pivot=first;
			i=first;
			j=last;
		
			// continue until almost divide array indexes are found
			while(i<j) {
				// increament the i pointer until you get lower value than pivot value 
				while(a[i]<=a[pivot]&& j<last)
					i++;

				// increament the i pointer until you get grater value than pivot value 
				while(a[j]>a[pivot])
					j--;
				// Swap the value 
				if(i<j) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
			// Update the pivot value
		    temp=a[pivot];
		    a[pivot]=a[j];
		    a[j]=temp;
		    
		    // divided array
			QuickSort(a, first,j-1);
			QuickSort(a, j+1, last);
					
		}
		
		
		return a;
	}
	
	public static void main(String[] args) {

		int[] a= {3,432,6743,2,67,2,8,93,5};
		a=QuickSort(a, 0, a.length-1);
		for(int n:a) {
			System.out.println(n);
		}
		
	}
	
	
}
