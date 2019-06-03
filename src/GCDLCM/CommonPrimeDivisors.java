package GCDLCM;
import java.util.HashSet;
import java.util.Set;

// codility

public class CommonPrimeDivisors {

	
//	
//	    public static int solution(int[] A, int[] B) {
//	        int count = 0;
//	        for(int i=0;i<A.length;i++) {
//	        	System.out.println(i);
//	            if(hasSamePrimeDivisors(A[i], B[i])){
//	                count++;    
//	                System.out.println("Yes");
//	            } 
//	        }
//	        return count;
//	    }
//	    
//	    public static int gcd(int a, int b) {
//		    if(a % b == 0) return b;
//		    return gcd(b,a%b);
//		}
//		
//		public static boolean hasSamePrimeDivisors(int a, int b) {
//		    int gcdValue = gcd(a,b);
//	        int gcdA;
//	        int gcdB;
//	        while(a!=1) {
//	            gcdA = gcd(a,gcdValue);
//	            if(gcdA==1)
//	                break;
//	            a = a/gcdA;
//	            System.out.println(a);
//	        }
//	        if(a!=1)  {
//	            return false;
//	        }
//	        while(b!=1) {
//	            gcdB = gcd(b,gcdValue);
//	            if(gcdB==1)
//	                break;
//	            b = b/gcdB;
//	            System.out.println("b"+b);
//	        }
//	        System.out.println("Valud"+b);
//	        return b==1;        
//		}
	
	
	static Set<Integer> findPrimeFactors(int n) {
		Set<Integer> set=new HashSet<Integer>();
		while(n%2==0) {
			set.add(2);
			n=n/2;
		}
		for(int i=3;i<=Math.sqrt(n);i++) {
			while(n%i==0) {
				set.add(i);
				n=n/i;
			}
		}
		if(n>2) {
			set.add(n);
		}
		return set;
	}
	public static int solution1(int[] A, int[] B) {
	   int index=-1;
	    for (int i = 0; i < B.length; i++) {
	    	Set<Integer> set1=findPrimeFactors(A[i]);
	    	Set<Integer> set2=findPrimeFactors(B[i]);
	    	boolean iscommon=true;
	    	if(set1.size()!=set2.size()) {
	    		continue;
	    	}
	    	for (Integer integer : set2) {
				if(!set1.contains(integer)) {
					iscommon=false;
					break;
				}
			}
	    	if(!iscommon) {
	    		continue;
	    	}else {
	    		return i+1;
	    	}
	    }	
		
	  return -1;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[3];
		int[] B=new int[3];
                	A[0] = 15;   B[0] = 75;
				    A[1] = 10;   B[1] = 30;
				    A[2] = 3;    B[2] = 5;
		System.out.println(solution1(A, B));
	}

}
