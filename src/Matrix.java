
class TwoDimentional {
	public int[][] matrix;
	int row;
	int columns;
	public TwoDimentional(int row,int columns) {
		matrix=new int[row][columns];
		this.row=row;
		this.columns=columns;
	}
	
	public void printMatrix() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(" "+matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(matrix.length+" "+matrix[0].length);
		
		System.out.println(matrix);
	}
	
	public void setMatrixVal(int r,int c,int val) {
		matrix[r-1][c-1]=val;
	}
}



public class Matrix {

	
	
	public static void main(String[] args) {

		TwoDimentional twoDMatrix=new TwoDimentional(5, 4);
		twoDMatrix.setMatrixVal(1, 1, 1);
		twoDMatrix.setMatrixVal(1, 2, 2);
		twoDMatrix.setMatrixVal(1, 3, 3);
		twoDMatrix.setMatrixVal(2, 1, 4);
		twoDMatrix.setMatrixVal(2, 2, 5);
		twoDMatrix.setMatrixVal(2, 3, 6);
		twoDMatrix.setMatrixVal(3, 1, 7);
		twoDMatrix.setMatrixVal(3, 2, 8);
		twoDMatrix.setMatrixVal(3, 3, 9);
		
		twoDMatrix.printMatrix();
	
		
		int[][] temp=new int[2][2];
		temp[0][0]=1;
		temp[1][0]=2;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(" "+temp[i][j]+" ");
			}
			System.out.println();
		}
		
		char[] oneD=new char[3];
		oneD[0]='c';
		for(int k=0;k<3;k++) {
			System.out.println("val is "+oneD[k]);
		}
		
		
		
		
		
	}

}
