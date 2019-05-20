package Practice;

/*
 * TapeEquilibrium codility
 * 
 */

public class TapeEquilibrium {

	public static int solution(int[] A) {

	    long sumright = 0;
	    long sumleft = 0;
	    long ans;

	    for (int i =1;i<A.length;i++)
	        sumright += A[i];

	    sumleft = A[0];
	    ans =Math.abs(Math.abs(sumright)+Math.abs(sumleft));

	    for (int P=1; P<A.length; P++)
	    {
	        if (Math.abs(Math.abs(sumleft) - Math.abs(sumright))<ans)
	            ans = Math.abs(Math.abs(sumleft) - Math.abs(sumright));
	        sumleft += A[P];
	        sumright -=A[P];
	    }
	    return (int) ans;  
	    
	    
	    // MY SOLUTION is time consuming 
	    /*
	     * 
	     *  int P=A.length-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<P;i++){
        
            int leftSum=0;
            for(int j=0;j<=i;j++){
                leftSum=Math.addExact(leftSum, A[j]);
            }
            int rightSum=0;
            for(int j=i+1;j<A.length;j++){
                rightSum=Math.addExact(rightSum, A[j]);
            }
            int dif=Math.abs(Math.subtractExact(leftSum, rightSum)); 
            if(dif<min){
                min=dif;
            } 
        }
       
       return min; 
	     */
	    
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 1, 2, 4, 3}));
		System.out.println(solution(new int[] { 3, 1}));
		System.out.println(solution(new int[] { -3, -1, -2, -4, -3}));
		System.out.println(solution(new int[] { -3, -1, -2, 4, 3}));
	}

}
