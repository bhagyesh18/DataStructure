
public class PowerOf2 {

	public static int powerof2bynumber(int N) {
		if(N<0) {
			return 0;
		}else if(N==1) {
			return 1;
		}else {
			int prev=powerof2bynumber(N/2);
			int cur=prev*2;
			System.out.println(cur);
			return cur;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerof2bynumber(100));
	}

}
