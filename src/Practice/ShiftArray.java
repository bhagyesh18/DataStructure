package Practice;

public class ShiftArray {
	 public static int[] solution(int[] A, int K) {
	       if(A.length==1){
	            return A;     
	       }
	       else if(A.length==K){
	           return A;
	       }else{
	            K=K%A.length;
	            for(int i=1;i<=K;i++){
	                int temp=A[A.length-1];
	                int temp2=A[0];
	                for(int j=0;j<A.length-1;j++){
	                    int tt3=A[j+1];
	                    A[j+1]=temp2;
	                    temp2=tt3;
	                }
	                A[0]=temp;
	            }
	            
	            // OR 
//	            temp=a[n-1];
//	            for(i=n-1;i>0;i--)
//	            {
//	              a[i]=a[i-1];
//	            }
//	            a[0]=temp;
	            
	       }
	       return A;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a=	 {3, 8, 9, 7, 6};
	a=solution(a, 8);
	}

}
