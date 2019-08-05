package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofArray {

	
	 public int[] intersect(int[] nums1, int[] nums2) {
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int i=0;
	        int j=0;
	        List<Integer> list=new ArrayList<Integer>();
	        while(i<nums1.length && j<nums2.length){
	            if(nums1[i]==nums2[j]){
	                list.add(nums1[i]);
	                i++;
	                j++;
	                continue;
	            }
	            if(nums1[i]<nums2[j]){
	                i++;
	            }else{
	                j++;
	            }
	        }
	        
	        int[] res=new int[list.size()];
	        int in=0;
	        for(Integer ii:list){
	            res[in]=ii;
	            in++;
	        }
	        return res;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
