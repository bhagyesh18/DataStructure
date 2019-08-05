import java.util.HashMap;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		
		String str1="Bhagyesh Patel";
		String str2="Patel hBagyesh";
		
		char[] str1charArray=str1.toCharArray();
		char[] str2charArray=str2.toCharArray();
 		
		if(str1charArray.length==str2charArray.length) {
			
			HashMap<Character, Integer> hashStr1=new HashMap<Character, Integer>();
			HashMap<Character, Integer> hashStr2=new HashMap<Character, Integer>();
			
			for(char c1 : str1charArray) {
				if(hashStr1.containsKey(c1)) {
					hashStr1.put(c1,hashStr1.get(c1)+1);
					
				}else {
					hashStr1.put(c1,1);
				}
			}
			
			for(char c2 : str2charArray) {
				if(hashStr2.containsKey(c2)) {
					hashStr2.put(c2,hashStr2.get(c2)+1);
				}else {
					hashStr2.put(c2,1);
				}
			}
			
			Set<Character> set1=hashStr1.keySet();
			Set<Character> set2=hashStr2.keySet();
			
			if(set1.size()!=set2.size()) {
				System.out.println("Not Equal as they don't have equals Number of Characters set");
			}else {
				for(Character ch1 : set1) {
					if(hashStr1.get(ch1)!=hashStr2.get(ch1)) {
						System.out.println("String 1 Char "+ch1+" : "+ hashStr1.get(ch1) +"String 2 Char"+ch1+" : "+ +hashStr2.get(ch1));
						System.out.println("Not Equal as they don't have equals Characters set");
					}
				}
				System.out.println("Equal");
				
			}
			
			
			
			
		}else {
			System.out.println("Both strings are not equal as they have different lenght");
		}
		
	}

}
