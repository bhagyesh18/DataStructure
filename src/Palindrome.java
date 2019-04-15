/*
 * For example, If 7325 is input number, then

7325 (Input Number) + 5237 (Reverse Of Input Number) = 12562

12562 + 26521 = 39083

39083 + 38093 = 77176

77176 + 67177 = 144353

144353 + 353441 = 497794 (Palindrome)
 */
public class Palindrome {

	public static boolean checkPalindrome(int n) {
		if(reverseNumber(n)==n) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int reverseNumber(int n) {
		int reversen=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			reversen=(reversen*10)+rem;
			n=n/10;
		}
		return reversen;
	}
	
	
	
	public static void main(String[] args) {
		int no=7125;
		int copy=no;
		while(!checkPalindrome(copy)) {
			copy=copy+reverseNumber(copy);
		}
		System.out.println(copy);
		
	}

}
