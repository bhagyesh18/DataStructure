package String;

// https://leetcode.com/problems/di-string-match/
public class DecreseIncreseString {

    public int[] diStringMatch(String S) {
        int min=0;
        int max=S.length();
        int[] res=new int[max+1];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                    res[i]=min;
                    min++;
            }else{
                    res[i]=max;
                    max--;
            }
        }
        res[S.length()]=min;
        return res;
    }
	
	public static void main(String[] args) {
		
	}

}
