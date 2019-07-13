import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {

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
 
	
	static boolean isPrime(int n) {
		if(n==1) {
			return true;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	// fast
	static boolean isPrimefast(int n) {
		if(n==1) {
			return true;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
    	
	  public static Set<Integer> primenumber(){
	        Set<Integer> set=new HashSet<Integer>();
	        for(int i=2;i<33;i++){
	            int flag=0;
	            for(int j=2;j<=i/2;j++){
	                if(i%j==0){
	                    flag=1;
	                    break;
	                }
	            }
	            if(flag==0){
	                set.add(i);
	            }
	        }
	        
	        return set;
	    }
	
	public static void main(String[] args) {
		System.out.println("Is prime "+isPrime(5));
		System.out.println("Is prime "+isPrime(10));
		
		
		int[] result=getprime(24);
		for(int a : result) {
			System.out.print(a+" ");
		}
		
		int[] result2=getprime(36);
		for(int a : result2) {
			System.out.print(a+" ");
		}
		
		Set<Integer> primenumber=primenumber();
		for (Integer integer : primenumber) {
			System.out.println(integer);
		}
		
	}

}
