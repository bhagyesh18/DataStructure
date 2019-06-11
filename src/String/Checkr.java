package String;

public class Checkr {

	public static boolean solution(String[] names,String input) {
		
		String firstName="";
		String middleName="";
		String lastName="";
		String[] inputToken=input.split(" ");
		if(inputToken.length==3) {
			 firstName=inputToken[0] ;
			 middleName=inputToken[1] ;
			 lastName=inputToken[2] ;
		}else if(inputToken.length==2) {
			 firstName=inputToken[0] ;
			 lastName=inputToken[1] ;
		} else if(inputToken.length==1) {
			 firstName=inputToken[0] ;
		}
		
		for(String fullname:names) {
			String[] nameToken=fullname.split(" ");
		System.out.println(nameToken.length);
			if(nameToken.length==3) {
				System.out.println(nameToken[0]+" "+nameToken[1]+" "+nameToken[2]);
				
				if(nameToken[0].equals(firstName) && nameToken[1].equals(middleName) && nameToken[2].equals(lastName)) {
					return true;
				}
				if(nameToken[0].equals(firstName) && nameToken[2].equals(lastName) && middleName.equals("")) {
					return true;
				}
				
			}else if(nameToken.length==2) {
				System.out.println(nameToken[0]+" "+nameToken[1]);
				
				if(nameToken[0].equals(firstName) && nameToken[1].equals(lastName)) {
					return true;
				}
			}	
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		String[] names= {"bhagyesh s patel","amit patel"};
		System.out.println(solution(names, "bhagyesh p patel"));
		
	}

}
