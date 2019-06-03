package Leader;
import java.util.*;

// Codility Dominator

public class Dominator {

	
	 public int solution(int[] A) {
	       if(A.length==1){
	           return 0;
	       }    
	       
	       int max=-1;
	       int avg=A.length/2;
	       HashMap<Integer,Integer> values=new HashMap<Integer,Integer>();
	       int index=-1;
	       
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
	       
	           
	       return index; 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
