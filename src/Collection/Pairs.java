package Collection;


//https://www.hackerrank.com/challenges/pairs/problem
public class Pairs {

	 // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
            arr=QuickSort(arr,0,arr.length-1);
        int i=0,j=1,count=0;
    
        while(j < arr.length) {
            int diff = arr[j] - arr[i];
            
            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else if (diff < k) {
                j++;
            }
        }
            
        return count;    

    }

    static int[] QuickSort(int[] a,int first,int last) {
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
		// TODO Auto-generated method stub
		  int[] in={1,2,4,6,7};
				System.out.print(""+pairs(2,in ));
	}

}
