/*
 * Write a java program to find all pairs of elements in the given array whose sum is equal to a 
 * given number. For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all 
 * pairs of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20. [Solution]
 */
public class PairElementEqualGivenNumber {

	public static void main(String[] args) {
	
		int[] array= {4, 5, 7, 11, 9, 13, 8, 12};
	    int givenNumber=20;
	    boolean flag=false;
		for(int i=0;i<array.length;i++) {
			flag=false;
			for(int j=0;j<i;j++) {
	    		if((array[i]+array[j])==givenNumber) {
	    			System.out.println("("+array[i]+","+array[j]+")");
	    			flag=true;
	    			break;
	    		}
	    	}
	    	for(int k=i+1;k<array.length;k++) {
	    		if((array[i]+array[k])==givenNumber) {
	    			System.out.println("("+array[i]+","+array[k]+")");
	    		}
	    	}
	    	
	    	if(flag)
	    		break;
	    	
	    }
		
	}

}
