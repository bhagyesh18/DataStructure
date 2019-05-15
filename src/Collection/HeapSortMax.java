package Collection;

// https://www.geeksforgeeks.org/heap-sort/


public class HeapSortMax 
{ 
	public void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// Build heap (rearrange array) 
		for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(arr, n, i); 

		printArray(arr);
		
		// One by one extract an element from heap 
		for (int i=n-1; i>=0; i--) 
		{ 
			// Move current root to end 
			printArray(arr);
			int temp = arr[0]; 
			arr[0] = arr[i]; 
			arr[i] = temp; 
			printArray(arr);
			// call max heapify on the reduced heap 
			heapify(arr, i, 0); 
		} 
	} 

	void heapify(int arr[], int n, int i) 
	{ 
		int largest = i; // Initialize largest as root 
		int l = 2*i + 1; // left = 2*i + 1 
		int r = 2*i + 2; // right = 2*i + 2 

		// If left child is larger than root 
		if (l < n && arr[l] > arr[largest]) 
			largest = l; 

		// If right child is larger than largest so far 
		if (r < n && arr[r] > arr[largest]) 
			largest = r; 

		// If largest is not root 
		if (largest != i) 
		{ 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 
			heapify(arr, n, largest); 
		} 
	} 

	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		int n = arr.length; 

		HeapSortMax ob = new HeapSortMax(); 
		ob.sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr); 
	} 
} 