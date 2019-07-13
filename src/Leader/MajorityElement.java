package Leader;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// Majority Element leet
// Majority element half of the number of element
public class MajorityElement {

	 public static int majorityElementFast(int[] A) {
		 Arrays.sort(A);
		 return A[A.length/2];
	 }
	
	// This is time consuming 
	 public int majorityElement(int[] A) {
         if(A.length==1){
	           return A[0];
	       }    
	       int max=-1;
	       int avg=A.length/2;
	       Map<Integer,Integer> values=new HashMap<Integer,Integer>();
	       int index=0;
	       
	       for(int i=0;i<A.length;i++){
	            if(values.containsKey(A[i])){
	                values.put(A[i],values.get(A[i])+1);   
	                if(values.get(A[i])>max && values.get(A[i])>avg){
	                        max=values.get(A[i]);
	                        index=i;
	                }
	            }else{
	                values.put(A[i],1);   
	            }
	       }
	       return A[index]; 
       }
	
	public static void main(String[] args) {
	
		int[] A= {1,2,3,4,1,2,3,1,1,1,3,4,1,1,1,1};
		System.out.println(majorityElementFast(A));
		
	}

}
