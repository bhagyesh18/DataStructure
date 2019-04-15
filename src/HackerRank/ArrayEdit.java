package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayEdit {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
            long max=0;   
    		int[] result=new int[n];
            for(int j=0;j<result.length;j++) {
            	result[j]=0;
            }
    		
    		for(int i=0;i<queries.length;i++){
                    	long a=queries[i][0];
                    	long b=queries[i][1];
                    	long c=queries[i][2];
                    //	for(int k=a-1;k<b;k++) {
                    	//	result[k]=result[k]+c;
                    //	}
            }
            
    		max=result[0];
    		for(int m=1;m<result.length;m++) {
    			if(max<result[m]) {
    				max=result[m];
    			}
    		}
                
          return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);
     //   System.out.println(res);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
