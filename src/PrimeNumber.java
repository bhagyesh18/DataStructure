
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
 
	
		
	
    	
	public static void main(String[] args) {
		int[] result=getprime(24);
		for(int a : result) {
			System.out.print(a+" ");
		}
		
		int[] result2=getprime(36);
		for(int a : result2) {
			System.out.print(a+" ");
		}
	}

}
