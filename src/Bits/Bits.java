package Bits;

public class Bits {
	public static void main(String[] args){
		int i=4;
		int count=0;
		while(i!=0){
			count+=i&1;
			i=i>>=1;
		}
		System.out.println(count);
		
		
		
		
	}
	  public String convertToBase7(int num) {
		     
	        String res="";
	        if(num==0)
	            return "0";
	        while(num!=0){
	            res=(num%7)+res;
	            num=num/7;
	        }
	        if(res.contains("-")){
	           res= res.replace("-","");
	            res="-"+res;
	        }
	        return res;
	        
	    }

	  

}
