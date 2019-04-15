/*
 * Write a java program to find continuous sub array of the given array whose sum is equal to a given number. 
 * For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you have to find continuous sub array 
 * in this array such that whose elements add up to 45. In this case, {5, 31, 9} is such sub array whose elements add up to 45. [Solution]
 */
public class CountinuosSubArray {

	public static void main(String[] args) {
		int[] array= {12, 1, 1, 1, 42, 8};
	    int givenNumber=45;
	    int sum=array[0];
	    int index=0;
	    for(int i=0;i<array.length;i++) {
	    	    sum=array[i];
	    	    
	    	    int j=i+1;
	    	    if(j<array.length) {
	    	    	sum=sum+array[j];
		    		if(sum==givenNumber) {
		    			System.out.println(array[i]+" "+array[j]);
		    		}
		    		index=j+1;
		    		
		    		while(sum<givenNumber && index<array.length ) {
		    			sum=sum+array[index];
		    			if(sum==givenNumber) {
		    				for(int q=i;q<=index;q++) {
		    					System.out.println(array[q]);
		    				}
		    				break;
		    			}
		    			index++;
		    		}	
	    	    	
	    	    }
	    	    
	    		
	    		sum=0;
	    }
	    
	}

}
