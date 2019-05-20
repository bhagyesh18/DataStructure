package PreffixSum;

/*
 * 
PassingCars Codility
 */
public class PasssingCars {

	 public static int solution(int[] A) {
        int one=0;
        int ans=0;
        if(A.length<=100000)
        {
                for(int i=0;i<A.length;i++){
                    if(A[i]==1){
                        one++;
                    }   
                }
                for(int i=0;i<A.length;i++){
                       if(A[i]==1){
                            one--;
                       }
                       if(A[i]==0){
                            ans+=one;
                       }
                }
                if(ans>=1000000000){
                    return -1;
                }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,1,0,1,0,1,1,0};
			System.out.println(solution(A));
	}

}
