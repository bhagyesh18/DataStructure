import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CountCharinString {

	static void countChar(String str) {
		
		HashMap hm = new HashMap();
	      
	      // Put elements to the map
	      hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      
			System.out.println(" Number of Times"+hm);
			
		
		HashMap<Character, Integer> hashmap=new HashMap<Character,Integer>();
		hashmap.put('q', 2);
		char[] tochar=str.toCharArray();
		for(char c:tochar) {
			if(hashmap.containsKey(c)) {
				hashmap.put(c, hashmap.get(c)+1);
			}else {
				hashmap.put(c,1);
			}
		}
		System.out.println(" Number of Times"+hashmap);
		
		Set<Character> setcha=hashmap.keySet();
		java.util.Iterator<Character> it=setcha.iterator();
		
		while(it.hasNext()) {
			System.out.println(""+it.next());
		}
		
		for(Character c:setcha) {
			System.out.println("Character:"+c+" Number of Times"+hashmap.get(c));
		}
		
	}
	
	public static void main(String[] args) {
		
		countChar("BhagyeshShaileshkumar Patel sdfsd    fsd f");
	}

}
