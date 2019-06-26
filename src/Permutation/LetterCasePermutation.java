package Permutation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCasePermutation {

	public static List<String> solution(String S){
		int countalph=0;
		for(int i=0;i<S.length();i++) {
			if((S.charAt(i)>=97 && S.charAt(i)<=122) || (S.charAt(i)>=65 && S.charAt(i)<=90)) {
				countalph++;
			}
		}
		
		int total=(int) Math.pow(2,countalph);
		System.out.println(total);
		List<String> list=new ArrayList<String>();
		
		for(int j=0;j<total;j++) {
			list.add("");
		}
		
		int div=total;
		for(int i=0;i<S.length();i++) {
			
			if(!Character.isDigit(S.charAt(i))) {
				countalph--;
				div=(int)Math.pow(2, countalph);
				System.out.println(div);	
			}
			
			boolean lower=true;
			int div1=div;
			for(int j=0;j<total;j++) {
				if(Character.isDigit(S.charAt(i))) {
					list.set(j, list.get(j).concat(String.valueOf(S.charAt(i))));
				}else {
					if(div1==0) {
						
						if(lower)
							lower=false;
						else
							lower=true;
						div1=div;
					}
					
					if(lower)
						list.set(j, list.get(j)+ Character.toLowerCase(S.charAt(i)));
					else
						list.set(j, list.get(j)+ Character.toUpperCase(S.charAt(i)));
					div1--;
				}
			}
			
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<String> list=solution("Ab6c");
		//Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
	
		
	}

}
