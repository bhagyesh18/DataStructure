package String;

public class LexicographicOrder {

	
	 static String LexicographicalMaxString(String str) { 
	        // loop to find the max leicographic  
	        // substring in the substring array 
	        String mx = ""; 
	        for (int i = 0; i < str.length(); ++i) { 
	            if (mx.compareTo(str.substring(i)) <= 0) { 
	                mx = str.substring(i); 
	                System.out.println("i-"+i+"  "+mx);
	            } 
	        } 
	  
	        return mx; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LexicographicalMaxString("aababcaaa"));
		
		System.out.println("ababaaa".compareTo("abcaaaaaewrwegwesdsagaaaaaaaaaaaaaaabaskdfjklaa"));
		System.out.println("ababaaa".compareTo("baaa"));
		System.out.println("cbabaaa".compareTo("baaa"));
		System.out.println("baaa".compareTo("babaaa"));
		System.out.println("baaa".compareTo("baaa"));
			
		
		
	}

}
