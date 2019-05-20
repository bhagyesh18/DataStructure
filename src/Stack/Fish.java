package Stack;

import java.util.Stack;

// Codility fish


public class Fish {

	private static int solution(int[] A,int[] B) {
	     Stack<Integer> fish=new Stack<Integer>();
         int counter=0;
           
          for(int i=0;i<A.length;i++)
          {
              if(B[i]==0){
                  
                  
                  while(fish.size()!=0){
                      if(fish.lastElement()>A[i]){
                          break;
                      }else{
                          fish.pop();
                      }   
                  }
                  
                  if(fish.size()==0){
                      counter++;   
                  }
                
              }else{
                  fish.add(A[i]);   
              }
          }
        
         counter+=fish.size(); 
         
         return counter;
	}
	
	
	public static void main(String[] args) {
		
//			      A[0] = 4    B[0] = 0
//				  A[1] = 3    B[1] = 1
//				  A[2] = 2    B[2] = 0
//				  A[3] = 1    B[3] = 0
//				  A[4] = 5    B[4] = 0
//		
	
		int[] A= {4,3,2,1,5};
		int[] B= {0,1,0,0,0};	
	
	}
	
}
