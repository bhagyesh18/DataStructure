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
	
	private int inbuildmethod(int n) {
		return Integer.bitCount(n);
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
	
	
	/* leetcode
	 *  Input: 11111111111111111111111111111101          // -3 
		Output: 10111111111111111111111111111111        //     -1073741825
		In Java unsigned are represented as 2's complement so 
	 */
	public static int revereseBinary(int n) {
		int mask=1;
		int newNo=0;
		int ind=31;
		for (int i = 0; i < 32; i++) {
			if((mask&n)!=0) {
				newNo=newNo^(1<<ind);
			}else {
				
			}
			ind--;
			mask<<=1;
		}
		return newNo;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(hammingWeight(11));   // 1011 
		
		System.out.println(hammingWeightOtherway(11));   // 1011 
		
		System.out.println(hammingWeightprint(2147483647));   // 1011 
		
		System.out.println(1<<1);
		System.out.println(1<<2);
		System.out.println(1<<3);
		System.out.println(1<<4);
		System.out.println(1<<5);
		System.out.println(1<<6);
		System.out.println(1<<7);
		System.out.println(1<<8);
		System.out.println(1<<31);
	
		System.out.println(revereseBinary(-3));
		
	}

}
