package Stack;
import java.util.*;

// https://app.codility.com/programmers/task/stone_wall/
// codility stonewall

public class StoneWall {

	  public int solution(int[] H) {
          Stack<Integer> stk=new Stack<Integer>();
        int counter=0;
        for(int i=0;i<H.length;i++){
                while(stk.size()!=0 && stk.lastElement()>H[i]){
                    stk.pop();   
                }
        
                if(stk.size()!=0 && stk.lastElement()==H[i]){
                    continue;
                }else{
                    counter++;
                    stk.push(H[i]);
                }        
        }
        
        return counter;   
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
