
public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int a=1;
				String binary="";
				int copy=a;
				int rem;
				while(copy>0) {
					rem=copy%2;
					
					binary=rem+binary;
					copy=copy/2;
				}
				System.out.print(binary);	
	}

}
