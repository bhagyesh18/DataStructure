/*
 * 
 *       
 *       
 *       1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
 
                  1                 
               2  2               
             3  3  3             
           4  4  4  4           
         5  5  5  5  5         
       6  6  6  6  6  6       
     7  7  7  7  7  7  7     
   8  8  8  8  8  8  8  8   
 9  9  9  9  9  9  9  9  9 
 */
public class Pyramid {

	public static void P1() {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int q=0;q<i;q++) {
				System.out.print(""+i+" ");
			}
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void P2() {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int s=1;s<=i;s++) {
					System.out.print(""+s+" ");	
		    }
			
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void P3() {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=n*2;j>=i*2;j--) {
				System.out.print(" ");
			}
			for(int s=1;s<=i;s++) {
					System.out.print(""+s+" ");	
		    }
			for(int b=i-1;b>=1;b--) {
				System.out.print(""+b+" ");	
	        }
			System.out.print("\n");
		}
		
		int noOfRows =9;
		 
        //Initializing rowCount with 1
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        //Implementing the logic
 
        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j value where j value will be from 1 to rowCount
 
            for (int j = 1; j <= rowCount; j++)          
            {
                System.out.print(j+" ");
            }
 
            //Printing j value where j value will be from rowCount-1 to 1
             
            for (int j = rowCount-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }                       
             
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1();
		P2();
		P3();
		
	}
	

}
