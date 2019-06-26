import java.util.HashMap;
import java.util.Map;

public class NumberToWord {
	static Map<String, String> digitMap = new HashMap<String, String>();

	public static void initilizeMap() {
		digitMap.put("1","one");
		digitMap.put("2","two");
		digitMap.put("3","three");
		digitMap.put("4","four");
		digitMap.put("5","five");
		digitMap.put("6","six");
		digitMap.put("7","seven");
		digitMap.put("8","eight");
		digitMap.put("9","nine");
		digitMap.put("10","ten");
		digitMap.put("11","eleven");
		digitMap.put("12","twelve");
		digitMap.put("13","thirteen");
		digitMap.put("14","fourteen");
		digitMap.put("15","fifteen");
		digitMap.put("16","sixteen");
		digitMap.put("17","seventeen");
		digitMap.put("18","eighteen");
		digitMap.put("19","nineteen");
		digitMap.put("20","twenty");
		digitMap.put("21","twenty one");
		digitMap.put("22","twenty two");
		digitMap.put("23","twenty three");
		digitMap.put("24","twenty four");
		digitMap.put("25","twenty five");
		digitMap.put("26","twenty six");
		digitMap.put("27","twenty seven");
		digitMap.put("28","twenty eight");
		digitMap.put("29","twenty nine");
		digitMap.put("30","thirty");
		digitMap.put("31","thirty one");
		digitMap.put("32","thirty two");
		digitMap.put("33","thirty three");
		digitMap.put("34","thirty four");
		digitMap.put("35","thirty five");
		digitMap.put("36","thirty six");
		digitMap.put("37","thirty seven");
		digitMap.put("38","thirty eight");
		digitMap.put("39","thirty nine");
		digitMap.put("40","forty");
		digitMap.put("41","forty one");
		digitMap.put("42","forty two");
		digitMap.put("43","forty three");
		digitMap.put("44","forty four");
		digitMap.put("45","forty five");
		digitMap.put("46","forty six");
		digitMap.put("47","forty seven");
		digitMap.put("48","forty eight");
		digitMap.put("49","forty nine");
		digitMap.put("50","fifty");
		digitMap.put("51","fifty one");
		digitMap.put("52","fifty two");
		digitMap.put("53","fifty three");
		digitMap.put("54","fifty four");
		digitMap.put("55","fifty five");
		digitMap.put("56","fifty six");
		digitMap.put("57","fifty seven");
		digitMap.put("58","fifty eight");
		digitMap.put("59","fifty nine");
		digitMap.put("60","sixty");
		digitMap.put("61","sixty one");
		digitMap.put("62","sixty two");
		digitMap.put("63","sixty three");
		digitMap.put("64","sixty four");
		digitMap.put("65","sixty five");
		digitMap.put("66","sixty six");
		digitMap.put("67","sixty seven");
		digitMap.put("68","sixty eight");
		digitMap.put("69","sixty nine");
		digitMap.put("70","seventy");
		digitMap.put("71","seventy one");
		digitMap.put("72","seventy two");
		digitMap.put("73","seventy three");
		digitMap.put("74","seventy four");
		digitMap.put("75","seventy five");
		digitMap.put("76","seventy six");
		digitMap.put("77","seventy seven");
		digitMap.put("78","seventy eight");
		digitMap.put("79","seventy nine");
		digitMap.put("80","eighty");
		digitMap.put("81","eighty one");
		digitMap.put("82","eighty two");
		digitMap.put("83","eighty three");
		digitMap.put("84","eighty four");
		digitMap.put("85","eighty five");
		digitMap.put("86","eighty six");
		digitMap.put("87","eighty seven");
		digitMap.put("88","eighty eight");
		digitMap.put("89","eighty nine");
		digitMap.put("90","ninety");
		digitMap.put("91","ninety one");
		digitMap.put("92","ninety two");
		digitMap.put("93","ninety three");
		digitMap.put("94","ninety four");
		digitMap.put("95","ninety five");
		digitMap.put("96","ninety six");
		digitMap.put("97","ninety seven");
		digitMap.put("98","ninety eight");
		digitMap.put("99","ninety nine");
		digitMap.put("100","one hundred");

	}

	public static String solution(long input) {
		
		initilizeMap();
		
		String number = String.valueOf(input);
		System.out.print(number+" > ");
		String result = "";

		if (number.length() == 1) {
			return digitMap.get(number);
		} else if (number.length() == 2) {
			return digitMap.get(number);
		} else if (number.length() == 3) {
			result=hundred(number);
		} else if (number.length() == 4 || number.length() == 5 || number.length() == 6) {
			result=thousand(number);
		} else if (number.length() == 7 || number.length() == 8 || number.length() == 9) {
				result=milions(number);
		}else if(number.length() == 10 || number.length() == 11 || number.length() == 12){
				result=billion(number);
		}else if(number.length() == 13 || number.length() == 14 || number.length() == 15){
			result=trillion(number);
	    }
		return result;

	}

	public static String hundred(String number) {
		String result="";
		if (number == "100") {
			return "one hundred";
		}else if(number == "000") {
			return result;
		}else {
			if(String.valueOf(number).charAt(0) == '0') {
				result = "";
			}else if(String.valueOf(number).charAt(0) != '0') {
				result = digitMap.get(String.valueOf(number.charAt(0)));
				result = result + " hundred ";
			}
			
			if((String.valueOf(number.charAt(1)) + "" + String.valueOf(number.charAt(2))).equals("00")) {
				return result;
			}else if (String.valueOf(number).charAt(1) == '0') {
				result = result + digitMap.get(String.valueOf(number.charAt(2)));
			} 
			else 
			{
				  result = result
						+ digitMap.get(String.valueOf(number.charAt(1)) + "" + String.valueOf(number.charAt(2)));
			}
		}
		return result;
	}
	
	public static String thousand(String number) {
		String result="";
		if(number.length()==7) {
			result = hundred(number.substring(0,3));
			if(result!="")
				result = result + " thousand ";
			result=result+hundred(number.substring(3));
		}else if(number.length()==6) {
			result = hundred(number.substring(0,3));
			if(result!="")
				result = result + " thousand ";
			result=result+hundred(number.substring(3));
		}else if(number.length()==5) {
			result = digitMap.get(number.substring(0,2));
			if(result!="")
				result = result + " thousand ";
			result=result+hundred(number.substring(2));
		}else{
			result = digitMap.get(String.valueOf(number.charAt(0)));
			if(result!="")
				result = result + " thousand ";
			result=result+hundred(number.substring(1));
				
		}
		return result;
	}
	
	public static String milions(String number) {
		String result="";
		if(number.length()==9) {
			result = hundred(number.substring(0,3));
			if(result!="")
				result = result + " million ";
			result = result+thousand(number.substring(3));
		}else if(number.length()==8) {
			result = digitMap.get(number.substring(0,2));
			if(result!="")
				result = result + " million ";
			result = result+thousand(number.substring(2));
		}
		else if(number.length()==7) {
			result = digitMap.get(String.valueOf(number.charAt(0)));
			if(result!="")
				result = result + " million ";
			result = result+thousand(number.substring(1));
		}
		
		return result;
	}
	
	public static String billion(String number) {
		String result="";
		if(number.length()==10) {
			result = digitMap.get(number.substring(0,1));
			result= result + " billion ";
			result = result+milions(number.substring(1));
		}else if(number.length()==11) {
			result = digitMap.get(number.substring(0,2));
			result= result + " billion ";
			result = result+milions(number.substring(2));
		}else if(number.length()==12) {
			result = hundred(number.substring(0,3));
			result= result + " billion ";
			result = result+milions(number.substring(3));
		}
		return result;
	}
	 
	public static String trillion(String number) {
		String result="";
		if(number.length()==13) {
			result = digitMap.get(number.substring(0,1));
			result= result + " trillion ";
			result = result+billion(number.substring(1));
		}else if(number.length()==14) {
			result = digitMap.get(number.substring(0,2));
			result= result + " trillion ";
			result = result+billion(number.substring(2));
		}else if(number.length()==15) {
			result = hundred(number.substring(0,3));
			result= result + " trillion ";
			result = result+billion(number.substring(3));
		}
		return result;
	}	
	public static void main(String args[]) {
		System.out.println(solution(1));
		System.out.println(solution(12));
		System.out.println(solution(121));
		System.out.println(solution(1212));
		System.out.println(solution(12120));
		System.out.println(solution(121204));
		System.out.println(solution(1212012));   
		System.out.println(solution(12345679));  
		System.out.println(solution(123456792));   
		System.out.println(solution(1234567922));   
		System.out.println(solution(12345679223l));
	    System.out.println(solution(123456792234l));
	    System.out.println(solution(1234567922345l));
	    System.out.println(solution(12345679223456l));
	    System.out.println(solution(123400000000567l));
	    System.out.println(solution(10000000001l));
	    
	    
	    
	}

}
