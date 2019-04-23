package Practice;

import java.util.Stack;

public class BalancedBracketStack {

	static String isBalanced(String string) {
		if(string.length()%2!=0) {
			return "NO";
		}else {
			Stack<Character> stack=new Stack<Character>();
			char[] charArray=string.toCharArray();
 			for(char c: charArray) {
				
 				if(c=='{' || c=='(' || c=='[') {
 					stack.add(c);
 				}
 				if(c=='}' || c==')' || c==']') {
 					if(stack.size()==0) {
 						return "NO";
 					}else {
 						char popVal=stack.pop();	
 						if(popVal=='{' && c!='}') {
 							return "NO";
 						} else 	if(popVal=='[' && c!=']') {
 							return "NO";
 						} else 	if(popVal=='(' && c!=')') {
							return "NO";
						}
 					}
 				}
			}
			
 			if(stack.size()!=0) {
 				return "NO";
 			}
 			
		}
		
		
		return "YES";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(isBalanced("{(([])[])[]}"));
			
	}

}
