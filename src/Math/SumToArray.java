package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SumToArray {

	 public static List<Integer> addToArrayForm(int[] A, int K) {
	        List<Integer> result=new ArrayList<Integer>();
	        int n=K;
	        int car=0;
	         int sum=0;
	        for(int i=A.length-1;i>=0;i--){
	            if(n!=0){
	               sum=A[i]+car+(n%10);
	                if(sum>9){
	                    car=1;
	                    result.add((sum%10));
	                    n=n/10;
	                }
	                else{
	                    car=0;
	                    result.add(sum);
	                    n=n/10;
	                }    
	                
	            }else{
	                sum=A[i]+car;
	                if(sum>9){
	                    car=1;
	                    result.add((sum%10));
	                    n=n/10;
	                }
	                else{
	                    car=0;
	                    result.add(sum);
	                    n=n/10;
	                }    
	                
	                
	            }
	        }
	        while(n!=0){
	                sum=car+(n%10);
	                if(sum>9){
	                    car=1;
	                    result.add((sum%10));
	                    n=n/10;
	                }
	                else{
	                    car=0;
	                    result.add(sum);
	                    n=n/10;
	                } 
	        }
	        
	        if(car!=0)
	            result.add(car);
	        
	        Collections.reverse(result);
	        
	        return result;
	    }
	
	 public List<Integer> addToArrayForm2(int[] A, int K) {
	        int N = A.length;
	        int cur = K;
	        List<Integer> ans = new ArrayList();

	        int i = N;
	        while (--i >= 0 || cur > 0) {
	            if (i >= 0)
	                cur += A[i];
	            ans.add(cur % 10);
	            cur /= 10;
	        }

	        Collections.reverse(ans);
	        return ans;
	    }	
		
	 
	 
	public static void main(String[] args) {
		System.out.println(addToArrayForm(new int[]{1,4,8,1,5},456));
						
	}

}
