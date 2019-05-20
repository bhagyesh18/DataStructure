package PreffixSum;

//https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/

public class MaxCounter {
	public static int[] solution(int N, int[] A) {

        final int condition = N + 1;
        int currentMax = 0;
        int lastUpdate = 0;
        int countersArray[] = new int[N];

        for (int iii = 0; iii < A.length; iii++) {
            int currentValue = A[iii];
            if (currentValue == condition) {
                lastUpdate = currentMax;
            } else {
                int position = currentValue - 1;
                if (countersArray[position] < lastUpdate)
                    countersArray[position] = lastUpdate + 1;
                else
                    countersArray[position]++;

                if (countersArray[position] > currentMax) {
                    currentMax = countersArray[position];
                }
            }

        }

        for (int iii = 0; iii < N; iii++)
           if (countersArray[iii] < lastUpdate)
               countersArray[iii] = lastUpdate;

        return countersArray;
    }
	public static void main(String[] args) {
		int[] A=new int[7];
		  A[0] = 3;
				    A[1] = 4;
				    A[2] = 4;
				    A[3] = 6;
				    A[4] = 1;
				    A[5] = 4;
				    A[6] = 4;
	
        System.out.println(solution(5, A));				    
	
	}

}
