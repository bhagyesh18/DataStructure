
public class Bits {
	public static void main(String[] args){
		int i=4;
		int count=0;
		while(i!=0){
			count+=i&1;
			i=i>>=1;
		}
		System.out.println(count);
	}
}
