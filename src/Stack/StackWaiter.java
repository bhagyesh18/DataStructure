package Stack;

import java.util.ArrayList;
import java.util.Stack;


// https://www.hackerrank.com/challenges/waiter/problem

public class StackWaiter {

	 static int[] waiter(int[] number, int q) {
	       int temp=q;
	       
	       Stack<Integer> a0Stack=new Stack<Integer>();
	       for(int i=0;i<number.length;i++) {
	    	   a0Stack.add(number[i]);
	       }
	       
	       
	       ArrayList<Stack> aArrayStack=new ArrayList<Stack>();
	       ArrayList<Stack> bArrayStack=new ArrayList<Stack>();
	       
	       aArrayStack.add(a0Stack);
	       
	       int[] primes=getprime(q);
	       for(int i=1;i<=q;i++) {
	    	   Stack<Integer> getAStack=aArrayStack.get(0);
	    	   
	    	   Stack<Integer> aNewStack=new Stack<Integer>();
	    	   Stack<Integer> bNewStack=new Stack<Integer>();
	    	   
	    	   while(getAStack.size()!=0) {
		    	   int popValue=getAStack.pop();	    		   
		    	   
		    	   if(popValue%primes[i-1]==0) {
		    		   bNewStack.push(popValue);
		    	   }else {
		    		   aNewStack.push(popValue);
		    	   }
	    	   
	    	   }
	    	   aArrayStack.remove(0);
	    	   if(aNewStack.size()==0) {
	    	  	   bArrayStack.add(bNewStack);
	    		   break;
	    	   }else {
	    	  	   aArrayStack.add(aNewStack);
	    	   }
	    	   bArrayStack.add(bNewStack);
	    	   
	       }
	       	
	       int[] result=new int[number.length];
	       int index=0;
	       int bSize=bArrayStack.size();
	       for(int j=0;j<bSize;j++) {
	    	   Stack<Integer> tempStack=bArrayStack.get(j);
	    	   while(tempStack.size()!=0) {
	    		   result[index]=tempStack.pop();
	    		   index++;
	    	   }
	       }
	       
	       if(aArrayStack.size()!=0) {
	    	   Stack<Integer> tempStackA=aArrayStack.get(0);
	    	   while(tempStackA.size()!=0) {
	    		   result[index]=tempStackA.pop();
	    		   index++;
	    	   }
	    	   
	       }
	       
	       return result;
	    }

	    static int[] getprime(int Q){
	        int b=1000000;
	        int counter=0;
	        int[] primes=new int[Q];
	        int index=0;
	        for(int i=2;i<b;i++) {
	            boolean isprime=true;
	            for(int j=2;j<=i/2;j++) {
	                if(i%j==0) {
	                    isprime=false;
	                    break;
	                }
	            }
	            if(isprime) {
	                counter++;
	                primes[index]=i;
	                index++;
	            }
	            if(counter==Q) {
	                return primes;
	            }
	        }
	        return primes;
	    }
	public static void main(String[] args) {
		
		int[] input= {3,3,4,4,9};
		int[] res=waiter(input, 2);
		for(int r : res) {
			System.out.println(r);
		}
		
	}

}
