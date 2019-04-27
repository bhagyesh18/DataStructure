
public class LCM {

	static int findGCD(int a,int b) {
		if(b==0)
			return a;
		return findGCD(b, a%b);
	}
	static int findLCM(int a,int b) {
		return (a*b)/findGCD(a, b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLCM(12, 16));
	}

}
