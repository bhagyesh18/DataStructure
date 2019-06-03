package GCDLCM;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class LCM {

	static int findGCD(int a,int b) {
		if(b==0)
			return a;
		return findGCD(b, a%b);
	}
	static int findLCM(int a,int b) {
		return (a*b)/findGCD(a, b);
	}
		
	//The approach is to start with the largest of the 2 numbers 
	//and keep incrementing the larger number by itself till smaller number perfectly divides the resultant
	static int findLCMBylargest(int a, int b) 
	    { 
	        int lar = Math.max(a, b); 
	        int small = Math.min(a, b); 
	        for (int i = lar; ; i += lar) { 
	            if (i % small == 0) 
	                return i; 
	        } 
	} 
	
	static ArrayList<Integer> primeFactors(int n) {
		ArrayList<Integer> primeFactors=new ArrayList<Integer>();
		while(n%2==0) {
			primeFactors.add(2);
			n=n/2;
		}
		
		for(int i=3;i<=Math.sqrt(n);i++) {
			while(n%i==0) {
				primeFactors.add(i);
				n=n/i;
			}
		}
		
		if(n>2) {
			primeFactors.add(n);
		}
		
		return primeFactors;
	}
	
	static int  findLCMPrimefactors(int a,int b) {
		ArrayList<Integer> arr1=primeFactors(a);
		ArrayList<Integer> arr2=primeFactors(b);
		int res=1;
		if(arr1.size()>arr2.size()) {
			for(int i=0;i<arr2.size();i++) {
				if(arr1.get(i)==arr2.get(i)) {
					res=res*arr1.get(i);
				}else {
					res=res*arr1.get(i);
					res=res*arr2.get(i);
				}
			}
		}else {
			for(int i=0;i<arr1.size();i++) {
				if(arr1.get(i)==arr2.get(i)) {
					res=res*arr1.get(i);
				}else {
					res=res*arr2.get(i);
					res=res*arr1.get(i);
				}
			}
			
		}
		
		
		return res;
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLCM(4, 10));
		System.out.println(findLCMPrimefactors(4, 10));
	}

}
