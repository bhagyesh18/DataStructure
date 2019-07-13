package String;

import java.util.regex.Pattern;

//https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class GCDString {

	 public String gcdOfStrings(String str1, String str2) {
	        if (str1.length() < str2.length()) { return gcdOfStrings(str2, str1); } // make sure str1 is not shorter than str2.
	        else if (!str1.startsWith(str2)) { return ""; } // shorter string is not common prefix.
	        else if (str2.isEmpty()) { return str1; } // gcd string found.
	        else { return gcdOfStrings(str1.substring(str2.length()), str2); } // cut off the common prefix part of str1.
	    }
	
	 
	 public String gcdOfStrings2(String str1, String str2) {
	        String s = str1.length() < str2.length() ? str1 : str2;
	        for (int d = 1, end = s.length(); d <= end; ++d) {
	            if (end % d != 0) { continue; } // only if length of s mod d is 0, can sub be common divisor.
	            String sub = s.substring(0, end / d);
	            if (str1.replace(sub, "").isEmpty() && str2.replace(sub, "").isEmpty()) {
	                return sub;
	            }
	        }
	        return "";
	    }
	 
	 public String gcdOfStrings3(String str1, String str2) {
	        for (int i = str1.length(); i > 0; --i) {
	            String gcd = str1.substring(0, i), ptn = "(" + gcd + ")+";
	            if (Pattern.compile(ptn).matcher(str1).matches() && Pattern.compile(ptn).matcher(str2).matches()) {
	                return gcd;
	            }
	        }
	        return "";
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
