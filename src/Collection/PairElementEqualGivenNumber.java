package Collection;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/*
 * Write a java program to find all pairs of elements in the given array whose sum is equal to a 
 * given number. For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all 
 * pairs of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20. [Solution]
 */
public class PairElementEqualGivenNumber {

	public static void main(String[] args) {
	
		int[] array= {4,5,7,8,9,11,12, 13};
	    Arrays.sort(array);
		int givenNumber=20;
	
		int i=0,j=array.length-1;
		while(i<array.length && i<j) {
			while(array[i]+array[j]>givenNumber && j>0) j--;
			if(array[i]+array[j]==givenNumber)
				System.out.println("("+array[i]+","+array[j]+")");
			i++;
		}
		
	}

}
