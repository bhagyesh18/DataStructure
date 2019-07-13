package Regex;
import java.util.regex.Pattern;


// * for any charater precedding to *, occurance of char 0 or more   For fsdfasf,df,
// . single character .
// + for any charater precedding to +, occurance of char 1 or more   For fsdfasf,df,
//

/*
^	Matches the beginning of the line.
$	Matches the end of the line.
.	Matches any single character except newline. Using m option allows it to match the newline as well.
[...]	Matches any single character in brackets.
[^...]	Matches any single character not in brackets.
\A	Beginning of the entire string.
\z	End of the entire string.
\Z	End of the entire string except allowable final line terminator.
re*	Matches 0 or more occurrences of the preceding expression.
re+	Matches 1 or more of the previous thing.
re?	Matches 0 or 1 occurrence of the preceding expression.
re{ n}	Matches exactly n number of occurrences of the preceding expression.
re{ n,}	Matches n or more occurrences of the preceding expression.
re{ n, m}	Matches at least n and at most m occurrences of the preceding expression.
a| b	Matches either a or b.
(re)	Groups regular expressions and remembers the matched text.
(?: re)	Groups regular expressions without remembering the matched text.
(?> re)	Matches the independent pattern without backtracking.
\w	Matches the word characters.
\W	Matches the nonword characters.
\s	Matches the whitespace. Equivalent to [\t\n\r\f].
\S	Matches the nonwhitespace.
\d	Matches the digits. Equivalent to [0-9].
\D	Matches the nondigits.
\A	Matches the beginning of the string.
\Z	Matches the end of the string. If a newline exists, it matches just before newline.
\z	Matches the end of the string.
\G	Matches the point where the last match finished.
\n	Back-reference to capture group number "n".
\b	Matches the word boundaries when outside the brackets. Matches the backspace (0x08) when inside the brackets.
\B	Matches the nonword boundaries.
\n, \t, etc.	Matches newlines, carriage returns, tabs, etc.
\Q	Escape (quote) all characters up to \E.
\E	Ends quoting begun with \Q.
*/

public class Regex {
	public static void main(String ardgs[]) {
		String regex="bhagy*sh";
		System.out.println(Pattern.matches("("+regex.substring(0,regex.indexOf('*'))+")(.*)("+regex.substring(regex.indexOf('*')+1,regex.length())+")", "bhagyes6756756756757sh"));
	
		System.out.println(Pattern.matches(".", "s"));  // True
		System.out.println(Pattern.matches(".", "sid"));  // False
		
		System.out.println(Pattern.matches("h*", "h"));  // True
		System.out.println(Pattern.matches("h*", "hhh"));  // true
		System.out.println(Pattern.matches("h*", ""));  // true
		System.out.println(">>>>>>"+Pattern.matches("h*", "sadasd"));  // false
		
		System.out.println(Pattern.matches("h+", "h"));  // True
		System.out.println(Pattern.matches("h+", "hhh"));  // true
		System.out.println(Pattern.matches("h+", ""));  // False

		System.out.println(Pattern.matches("a^", "a"));  // False
		System.out.println(Pattern.matches("a", "a"));  // true
		
		System.out.println(Pattern.matches("[0-9]", "a"));  // False
		System.out.println(Pattern.matches("[0-9]", "1"));  // true
		System.out.println(Pattern.matches("[0-9]", "12"));  // False
		System.out.println(Pattern.matches("[0-9]*", "12"));  // True
		System.out.println(Pattern.matches("[0-9]*", ""));  // True
		System.out.println(Pattern.matches("[0-9]*", "b"));  // False
		System.out.println(Pattern.matches("[0-9]+", ""));  // True
		System.out.println(Pattern.matches("[0-9]+", "123"));  // False
		
		
		System.out.println(Pattern.matches("[a]", "a"));  // True
		System.out.println(Pattern.matches("[a]", "aaaaaa"));  // False
		System.out.println(Pattern.matches("[a]", "aaaaab"));  // False
		System.out.println(Pattern.matches("[abc]", "a"));  // True
		System.out.println(Pattern.matches("[abc]", "a"));  // True
		System.out.println(Pattern.matches("[abc]", "d")); // False
		System.out.println(Pattern.matches("[^abc]", "a")); // False  
		System.out.println(Pattern.matches("[^abc]", "d")); // True 
		System.out.println(Pattern.matches("[abc]*", "aaaaaabbbb")); // True  
		System.out.println(Pattern.matches("[abc]*", "aaaaabc")); // True 
		System.out.println(Pattern.matches("[abc]*", "aaaaabcZ")); // false 
		System.out.println(Pattern.matches("[abc]*", "bcaaaaaaabc")); // true 
		//re?	Matches 0 or 1 occurrence of the preceding expression.
		System.out.println(Pattern.matches("[abc]?", "abc")); // False 
		System.out.println(Pattern.matches("[abc]?", "a")); // true 
		System.out.println(Pattern.matches("[abc]?", "")); // true 
		
		
		System.out.println(Pattern.matches("(bhagyesh)(.*)(patel)", "bhagyeshpatel")); // True 
		System.out.println(Pattern.matches("(bhagyesh)(.*)(patel)", "bhagyeshfsfpatel")); // True 
		
		System.out.println(Pattern.matches("(bhagyesh)(.*)[0-9](patel)", "bhagyeshSpatel")); // False 
		System.out.println(Pattern.matches("(bhagyesh)(.*)[0-9](patel)", "bhagyeshS2patel")); // True 
		
		System.out.println(Pattern.matches("(bhagyesh)[0-9](patel)", "bhagyeshpatel")); // True
		System.out.println(Pattern.matches("(bhagyesh)[0-9](patel)", "bhagyesh7patel")); // True 
		System.out.println(Pattern.matches("(bhagyesh)[0-9](patel)", "bhagyesh73patel")); // false 
		System.out.println(Pattern.matches("(bhagyesh)[0-9]*(patel)", "bhagyesh73patel")); //true 
		System.out.println(Pattern.matches("(bhagyesh)[0-9]*(patel)", "bhagyeshpatel")); // true 
		System.out.println(Pattern.matches("(bhagyesh)[0-9]+(patel)", "bhagyesh73patel")); // true 
		
		
//		re{ n}	Matches exactly n number of occurrences of the preceding expression.
//		re{ n,}	Matches n or more occurrences of the preceding expression.
//		re{ n, m}	Matches at least n and at most m occurrences of the preceding expression.
		System.out.println(Pattern.matches("[a]{2}", "aa")); //true 
		System.out.println(Pattern.matches("[a]{2}", "aaa")); //False 
		System.out.println(Pattern.matches("[a]{2,}", "aaa")); // true 
		System.out.println(Pattern.matches("[a]{2,}", "a")); // False 
		System.out.println(Pattern.matches("[a]{2,3}", "aaa")); // true 
		System.out.println(Pattern.matches("[a]{2,3}", "a")); // False 

		
		System.out.println(Pattern.matches("[a]|[b]", "a")); // true 
		System.out.println(Pattern.matches("[a]|[b]", "b")); // true 
		System.out.println(Pattern.matches("[a]|[b]", "z")); // False 
		
		
		// Round bracket is used for group only
		// (re)	Groups regular expressions and remembers the matched text.
		System.out.println(Pattern.matches("(a)", "a")); // true 
		System.out.println(Pattern.matches("(a)", "b")); // false 
		System.out.println(Pattern.matches("()", "z")); // False
		System.out.println(Pattern.matches("()", "")); // True
		System.out.println(Pattern.matches("(.*)", "sdgdfgdsfgdsgsdg")); // True
		
		
		/*
		 * 	Any character (may or may not match terminator)
\d	Any digits, short of [0-9]
\D	Any non-digit, short for [^0-9]
\s	Any whitespace character, short for [\t\n\x0B\f\r]
\S	Any non-whitespace character, short for [^\s]
\w	Any word character, short for [a-zA-Z_0-9]
\W	Any non-word character, short for [^\w]
\b	A word boundary
\B	A non word boundary
		 */
		
		System.out.println(Pattern.matches("\\d", "1")); // true 
		System.out.println(Pattern.matches("\\d", "123")); // false  one character only
		System.out.println(Pattern.matches("\\D", "a")); // true
		System.out.println(Pattern.matches("\\D", "12")); // False
	
		System.out.println(Pattern.matches("\\s", "\n")); // true 
		System.out.println(Pattern.matches("\\s", "n")); // false  
		System.out.println(Pattern.matches("\\S", "n")); // true
		System.out.println(Pattern.matches("\\S", "\n")); // False
			
		System.out.println(Pattern.matches("\\w", "a")); // true 
		System.out.println(Pattern.matches("\\w", "!")); // false  
		System.out.println(Pattern.matches("\\W", "!")); // true
		System.out.println(Pattern.matches("\\W", "1")); // False
			
		System.out.println(Pattern.matches("\\w*", "Thiisbhagyesh")); // true   No space allowed  
		System.out.println(Pattern.matches("\\w*", "Thisis$")); // False  
		
		System.out.println(Pattern.matches("bhagyesh.*patel", "bhagyeshpatel")); // true 
		System.out.println(Pattern.matches("bhagyesh.*patel", "bhagyeshpatel234")); // false 
		
		
		// email Address Regex
		System.out.println(Pattern.matches("([a-zA-Z0-9_]*)(@)([a-zA-Z0-9]*)(\\.)([a-zA-Z0-9]*)", "bhagyesh123@gmail.com")); // true 
		System.out.println(Pattern.matches("([a-zA-Z0-9_]*)(@)([a-zA-Z0-9]*)(\\.)([a-zA-Z0-9]*)", "bhagyesh_18@gmail.com")); // false 
		System.out.println(Pattern.matches("([a-zA-Z0-9_]*)(@)([a-zA-Z0-9]*)(\\.)([a-zA-Z0-9]*)", "bhagy44esh&_18@gmail.com")); // false 
		System.out.println(Pattern.matches("([a-zA-Z0-9_]*)(@)([a-zA-Z0-9]*)(\\.)([a-zA-Z0-9]*)", "bhagyesh23@@gmailcom")); // false 
		System.out.println(Pattern.matches("([a-zA-Z0-9_]*)(@)([a-zA-Z0-9]*)(\\.)([a-zA-Z0-9]*)", "bhagyesh18@gmail..com")); // false 
			
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false 
		
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		
	
		System.out.println(Pattern.matches("(ABAB)+", "ABABAB"));// false expected ABBB B can repeat more than 1 times 
		
		
		
		
		
		
	}
}
