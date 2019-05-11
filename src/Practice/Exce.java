package Practice;

import java.util.HashMap;
import java.util.Map;

public class Exce {
	

		  static Map<String,Integer> map;

		  public Exce() {

		    map = new HashMap<>();

		    map.put("foo", 1);

		    map.put("bar", 3);

		  }

		  public static int getValue(String input, int numRetries) throws Exception {

		    try {

		    	return map.get(input);
		    	
		    }

		    catch (Exception e) {
		    	System.out.println(numRetries);
		      if (numRetries > 3) {

		        throw e;

		      }

		      return getValue(input, numRetries + 1);

		    }

		  }

	public static void main(String[] args) throws Exception  {
	//	getValue("baz", 0);	
		
	}

}
