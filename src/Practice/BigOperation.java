package Practice;

public class BigOperation {

	public static String sum(String a,String b) {
		int carries=0;
		int i=a.length()-1;
		int j=b.length()-1;
		String result="";
		while(i>=0 && j>=0) {
			int sum=Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(j)))+carries;
			if(sum>=10) {
				carries=1;
				result=(sum%10)+result;
			}else {
				carries=0;
				result=sum+result;
			}
			i--;
			j--;
		}
		if(i<j) {
			while(j>=0) {
				int sum=Integer.parseInt(String.valueOf(b.charAt(j)))+carries;
				if(sum>=10) {
					carries=1;
					result=(sum%10)+result;
				}else {
					carries=0;
					result=sum+result;
				}
				j--;
			}
		}else {
			while(i>=0) {
				int sum=Integer.parseInt(String.valueOf(a.charAt(i)))+carries;
				if(sum>=10) {
					carries=1;
					result=(sum%10)+result;
				}else {
					carries=0;
					result=sum+result;
				}
				i--;
			}
		}
		if(carries!=0) {
			System.out.println(carries+""+result);
		}else {
			System.out.println(result);
				
		}
		
		
		
		return "";
	}
public static String sub(String a,String b) {
		
		int carries=0;
		int i=a.length()-1;
		int j=b.length()-1;
		String result="";
		while(i>=0 && j>=0) {
			int sum=Integer.parseInt(String.valueOf(a.charAt(i)))-Integer.parseInt(String.valueOf(b.charAt(j)))+carries;
			if(sum>=10) {
				carries=1;
				result=(sum%10)+result;
			}else {
				carries=0;
				result=sum+result;
			}
			i--;
			j--;
		}
		if(i<j) {
			while(j>=0) {
				int sum=Integer.parseInt(String.valueOf(b.charAt(j)))+carries;
				if(sum>=10) {
					carries=1;
					result=(sum%10)+result;
				}else {
					carries=0;
					result=sum+result;
				}
				j--;
			}
		}else {
			while(i>=0) {
				int sum=Integer.parseInt(String.valueOf(a.charAt(i)))+carries;
				if(sum>=10) {
					carries=1;
					result=(sum%10)+result;
				}else {
					carries=0;
					result=sum+result;
				}
				i--;
			}
		}
		if(carries!=0) {
			System.out.println(carries+""+result);
		}else {
			System.out.println(result);
				
		}
		
		
		
		return "";
	}
	public static void main(String[] args) {
		
		System.out.println(sum("234", "99999999"));
		
	}

}
