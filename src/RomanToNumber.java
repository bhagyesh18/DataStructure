
public class RomanToNumber {


	    public int romanToInt(String s) {
	        int len=s.length();
	        int i=0;
	        int sum=0;
	        while(i<len){
	            if(s.charAt(i)=='I'){
	                if((i+1)<len && s.charAt(i+1)=='V'){
	                    sum=sum+4;
	                    i++;
	                }else if((i+1)<len && s.charAt(i+1)=='X'){
	                    sum=sum+9;
	                    i++;
	                }else {
	                  sum++;  
	                }
	            }else if (s.charAt(i)=='X'){
	                if((i+1)<len && s.charAt(i+1)=='L'){
	                    sum=sum+40;
	                    i++;
	                }else if((i+1)<len && s.charAt(i+1)=='C'){
	                    sum=sum+90;
	                    i++;
	                }else {
	                  sum=sum+10;  
	                }
	            }else if (s.charAt(i)=='C'){
	                if((i+1)<len && s.charAt(i+1)=='D'){
	                    sum=sum+400;
	                       i++;
	                }else if((i+1)<len && s.charAt(i+1)=='M'){
	                    sum=sum+900;
	                       i++;
	                }else {
	                  sum=sum+100;  
	                }
	            }else if (s.charAt(i)=='V'){
	                sum=sum+5;
	            }else if (s.charAt(i)=='L'){
	                sum=sum+50;
	            }else if (s.charAt(i)=='D'){
	                 sum=sum+500;
	            }else if (s.charAt(i)=='M'){
	                 sum=sum+1000;
	            }
	            
	            i++;
	            
	            
	        }
	        
	        return sum;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
