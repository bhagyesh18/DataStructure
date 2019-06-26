package Bits;


//https://leetcode.com/problems/number-of-1-bits

// Java Does not support unsigned Integer number 


public class NumberOf1Bits {

	public static int hammingWeight(int n) {
	    int bits = 0;
	    int mask = 1;    // 1
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {       // 1011 & 1   > next time 1011 & 10  > 1011 & 100
	            bits++;
	        }
	        mask <<= 1;      // 1  > 10 > 100 > 1000
	    }
	    return bits;
	}
	
	
	public static int hammingWeightprint(int n) {
	    int bits = 0;
	    int mask = 1;    // 1
	    String temp="";
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {       // 1011 & 1   > next time 1011 & 10  > 1011 & 100
	            bits++;
	            temp="1"+temp;
	        }else {
	        	temp="0"+temp;
	        }
	        mask <<= 1;      // 1  > 10 > 100 > 1000
	    }
	    System.out.println(temp.substring(temp.indexOf('1')));
	    return bits;
	}
	
	// lengthy
	public static int hammingWeightOtherway(int n) {
	    int bits = 0;
	    int mask = 1;    // 1
	    while(n>0) {
	    	if(n%2!=0)
	    		bits++;
	    	n=n/2;
	    }
	    return bits;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(hammingWeight(11));   // 1011 
		
		System.out.println(hammingWeightOtherway(11));   // 1011 
		
		System.out.println(hammingWeightprint(11));   // 1011 
		
		System.out.println(1<<1);
		System.out.println(1<<2);
		System.out.println(1<<3);
		System.out.println(1<<4);
		System.out.println(1<<5);
		System.out.println(1<<6);
		System.out.println(1<<7);
		System.out.println(1<<8);
		System.out.println(1<<31);
		
	}

}
