package Leader;

public class FindLeader {
		
		public static int solution(int[] a) {
			 int leader = a[0];
			  int ctr = 1;

			  for(int i = 1; i < a.length; i++){
			    if(a[i] == leader) ctr++;
			    else ctr--;
			    if(ctr == 0){
			      ctr = 1;
			      leader = a[i];
			    }
			  }
//				candidate_ele = ''
//					    candidate_cnt = 0
//					 
//					    for value in A:
//					        if candidate_ele == '':
//					            candidate_ele = value
//					            candidate_cnt = 1
//					        else:
//					            if value != candidate_ele:
//					                candidate_cnt -= 1
//					                if candidate_cnt == 0:
//					                    candidate_ele = ''
//					            else:
//					                candidate_cnt += 1
				
				
				
			return leader;
			
		}
	
		public static void main(String[] args) {
			
		//	int[] A= {1,2,2,2,1,1,1,3,4,5};
			int[] A= {1,2,5,2,1,89,6,1,5,3,1,89};
			
			System.out.println(solution(A));
			
		}
	
}
