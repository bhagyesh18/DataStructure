import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Rows");
		int r=scan.nextInt();
		System.out.println("Enter Columns");
		int c=scan.nextInt();
		
		int[][] a=new int[r][c];
		int[][] b;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("Enter a["+i+"]["+j+"]: ");
				a[i][j]=scan.nextInt();
			}
		}
		
		int[][] transpose=new int[a[0].length][a.length];
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[0].length;j++) {
				transpose[i][j]=a[j][i];
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
			System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[0].length;j++) {
			System.out.print(" "+transpose[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
