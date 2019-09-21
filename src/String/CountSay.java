package String;


// https://leetcode.com/problems/count-and-say/
public class CountSay {

	 public static String countAndSay(int n) {
		 if (n == 1) {
	            return "1";
	        }
	        String preStr = countAndSay(n - 1);
	        StringBuilder result = new StringBuilder();
	        char previous = preStr.charAt(0);
	        int num = 1;
	        for (int i = 1; i < preStr.length(); i++) {
	            char cur = preStr.charAt(i);
	            if (cur == previous) {
	                num++;
	            } else {
	                result.append(num).append(previous);
	                previous = cur;
	                num = 1;
	            }
	        }
	        result.append(num).append(previous);
	        return result.toString();
	    }
		
	
	public static void main(String[] args) {
			int n=111;
		//System.out.println(countAndSay(n));
		
		
	}

}
