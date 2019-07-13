package Bits;

public class DecimanToBase7 {
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
