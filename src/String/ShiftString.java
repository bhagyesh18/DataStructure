package String;

public class ShiftString {

	 public static boolean rotateString(String A, String B) {
	        if(A.equals(B)){
	            return true;
	        }
	        
	        for(int i=0;i<A.length();i++){
	            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
	            if(A.equals(B)){
	                return true;
	            }
	        }
	        
	        return false;
	    }
	
	public static void main(String[] args) {

		System.out.println(rotateString("bhagyesh", "hagyeshb"));
		
		char c='b';
		System.out.println(c-97);
		
	}

}
