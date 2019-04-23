package Practice;

//https://www.hackerrank.com/challenges/dynamic-array/problem

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DynamicArray {
	 static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
         List<Integer> list=new ArrayList<Integer>();
         ArrayList<Integer> sequence[]=new ArrayList[n];
         
     	for (int i=0; i<n; ++i) 
			sequence[i]= new ArrayList<Integer>(); 
         
         int lastAnswer=0;
         
         for(List<Integer> innerlist: queries)
         { 
        	 int arg1=innerlist.get(0);
        	 int arg2=innerlist.get(1);
        	 int arg3=innerlist.get(2);
        	 
        	 if(arg1==1) {
        		 int seq=((arg2^lastAnswer)%n);
        		 sequence[seq].add(arg3);
        		 
        	 }else if(arg1==2) {
        		 int seq=((arg2^lastAnswer)%n);
        		 int valElement=arg3%sequence[seq].size();
        		 lastAnswer=sequence[seq].get(valElement);
        		 System.out.println(lastAnswer);
        	 }
         }
         
         return null;
	 	}
		public static void main(String args[]) {
			List<List<Integer>> queries = new ArrayList<>();
			List<Integer> l1=new ArrayList<Integer>();
			l1.add(1);
			l1.add(0);
			l1.add(5);
			queries.add(l1);
			
			List<Integer> l2=new ArrayList<Integer>();
			l2.add(1);
			l2.add(1);
			l2.add(7);
			queries.add(l2);
			
			
			List<Integer> l3=new ArrayList<Integer>();
			l3.add(1);
			l3.add(0);
			l3.add(3);
			queries.add(l3);
			
			
			List<Integer> l4=new ArrayList<Integer>();
			l4.add(2);
			l4.add(1);
			l4.add(0);
			queries.add(l4);
			
			
			List<Integer> l5=new ArrayList<Integer>();
			l5.add(2);
			l5.add(1);
			l5.add(1);
			queries.add(l5);
			
						
			dynamicArray(2, queries);
			
			
		}
}
