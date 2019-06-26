package Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/degree-of-an-array/solution/
public class DegreeOfArray {

	public static int finddegreeOfArray(int[] array) {
		Map<Integer, Integer> left=new HashMap<Integer, Integer>();
		Map<Integer, Integer> right=new HashMap<Integer, Integer>();
		Map<Integer, Integer> count=new HashMap<Integer, Integer>();
		
		for (int i = 0; i < array.length; i++) {
			int val=array[i];
			if(!left.containsKey(val))	
				left.put(val, i);
			right.put(val, i);
			
			count.put(val, count.getOrDefault(val, 0)+1);
		}
		
		int degree=Collections.max(count.values());
		int ans=array.length;
		for(Integer key:count.keySet()) {
			if(count.get(key)==degree) {
				ans=Math.min(ans,right.get(key)-left.get(key)+1);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] A= {1,2,3,4,5,2,2,1};
			System.out.println(finddegreeOfArray(A));
			
			
			String email="bhagyesh+patel@gmail.com";
			String temp=email.substring(0,email.indexOf('@'));
			System.out.println(temp);
			temp=temp.replace(".", "");
			if(temp.indexOf('+')>-1) {
				temp=temp.substring(0,temp.indexOf('+'));
			}
			email=temp+email.substring(email.indexOf('@'));
			
			
	}

}
