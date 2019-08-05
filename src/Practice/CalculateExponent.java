package Practice;

public class CalculateExponent {

	public static int exponent(int base,int number,int pow) {
		if(number==Math.pow(base,pow)) {
			return pow;
		}else if (number<Math.pow(base, pow)) {
			return -1;
		}else {
			return exponent(base, number, pow+1);
		}
	}
	

	public static void main(String[] args) {
		System.out.println(exponent(3, 81, 1));
	}

}
