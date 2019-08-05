package String;

import java.util.HashSet;
import java.util.Set;


/*
 * “Geeks for Geeks”-> ‘for’;
“Geeks Quiz” -> ‘GksQuiz’;
 */
public class SingleCharacterInString {

	public static String distinctChar(String str) {
		StringBuilder sb=new StringBuilder("");
		Set<Character> set=new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				sb.deleteCharAt(sb.indexOf(String.valueOf(str.charAt(i))));
			}else {
				set.add(str.charAt(i));
				sb.append(str.charAt(i));
			}
		}
		return sb.toString().replace(" ", "");
	}
	
	public static void main(String[] args) {
	
		System.out.println(distinctChar("Geeks Quiz"));
		

		
	}

}
