package Stack;

import java.util.*;

// https://www.hackerrank.com/challenges/simple-text-editor/problem

import com.sun.org.apache.bcel.internal.generic.LASTORE;


public class StackTextEditor {

	  static Stack<String> undoStack=new Stack<String>();;
	 
	// Complete the isBalanced function below.
	    static String isBalanced(String s) {
	            if(s.length()%2!=0){
	                return "NO!";
	            }else{
	                //Stack<Character> stack=new Stack<Character>();
	                int index=s.length()-1;
	                
	                for(int i=0;i<(s.length()/2);i++){
	                    if(s.charAt(i)=='{') {
		                	if(s.charAt(index)!='}') {
						               		return "NO";
						    }
		                }else if(s.charAt(i)=='[') {
		                	if(s.charAt(index)!=']') {
		                		return "NO";
		                	}
		                	
		                } else if(s.charAt(i)=='(') {
		                	if(s.charAt(index)!=')') {
		                		return "NO";
		                	}
		                }else {
		                	return "NO";
		                }
		                index--;
	                }
	            }
	        return "YES";
	    }

	    

	 
	
	public static void main(String args[]) {
		
		String S="";
		
		Scanner scan=new Scanner(System.in);
		int Q=scan.nextInt();
	    ArrayList<String> qOperations=new ArrayList<String>();
		String input="";
		scan=new Scanner(System.in);
	    for(int i=0;i<Q;i++) {
	    	input="";
	    	input=scan.nextLine();
	    	qOperations.add(input);
	    }
	    
	    input="";
	    for(String operations : qOperations) {
	    	input=operations;
	    	
	    	if(input.charAt(0)=='1') {
	    		// Append
	    		
	    		String data=input.split(" ")[1];
	    		undoStack.add(S);
	    		S=S.concat(data);
	    		
	    	}else if(input.charAt(0)=='2') {
	    		// Delete
	    		int lastindex=Integer.parseInt(input.split(" ")[1]);
	    		if(S.length()>=lastindex) {
	    			undoStack.add(S);
	    			S=S.substring(0, S.length()-lastindex);
	    			
	    		}else {
	    			
	    		}
	    		
	    	}else if(input.charAt(0)=='3') {
	    		// Print
	    		int index=Integer.parseInt(input.split(" ")[1]);
	    		
	    		if(S.length()>=index) {
	    				System.out.println(S.charAt(index-1));
	    		}else {
	    			System.out.println("");
	    	    }
	    	}else if(input.charAt(0)=='4') {
	    		S=undoStack.pop();
	    	}
	    }
	}
	
	/*
	 * 10
1 ewcgpjfh
1 igqsbqyp
1 qsdliigcj
4
3 15
1 iilmgp
2 8
4
2 18
1 scwhors
	 */
	
}
