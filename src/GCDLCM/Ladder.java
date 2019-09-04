package GCDLCM;

import java.util.Arrays;

public class Ladder {

	
	// different ways to take steps on ladder 
	public static int[] solution(int[] A, int[] B) {
		int[] result = new int[A.length];
		
		 
        int L = A.length;
        int max = 0;
        
        // find max element from A[] and create fibbonaci series till that number so 
        // we dont need to find the fibbonaci number every time.
        for (int i = 0; i < L; i++) {
            max = Math.max(A[i], max);
        }
       

        		
        int[] fibonacci = new int[max+1]; 
        
        fibonacci[0] =1;
        fibonacci[1] =1;

        // Create fibbonaci series till max element and store in array so we dont need to find frequently
        // (int)Math.pow(2, 30) because it is mentioned in the defintion of program that A[] value can between 1 to 30 
        // so it helps from overflowing values from the array 
        for(int i=2; i<= max; i++){
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % (int)Math.pow(2, 30);
        }
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(fibonacci[A[i]]  +" "+(int) Math.pow(2, B[i]));
			result[i] = (fibonacci[A[i]]) %(int) Math.pow(2, B[i]);
		}

		return result;
	}

	public static void main(String[] args) {

		int[] A = new int[5];
		int[] B = new int[5];
		A[0] = 4;
		B[0] = 3;
		A[1] = 4;
		B[1] = 2;
		A[2] = 5;
		B[2] = 4;
		A[3] = 5;
		B[3] = 3;
		A[4] = 1;
		B[4] = 1;
		A = solution(A, B);
		for (int i : A) {
			System.out.println(i);
		}
		
		String s="abc";
		s=s.substring(0, 0);
		System.out.println(s);
		long n=10;
	    int and=(int) n;
		
	}

}
