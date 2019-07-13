package Practice;

// leet Projection Area of 3D Shapes

public class Cubes3D {
	public static int projectionArea(int[][] grid) {
		  int N=grid.length;
	        int x=0,z=grid.length*grid.length;
	        int maxy=0;
	        int max=0;
	        int tempx=0,tempy=0;
	        for(int i=0;i<N;i++){
	                maxy=0;
	                max=0;
	                for(int j=0;j<N;j++){
	                    tempy=grid[j][i];
	                    if(tempy>maxy){
	                        maxy=tempy;
	                    }
	                    tempx=grid[i][j];
	                    if(tempx>max){
	                        max=tempx;
	                    }
	                    if(tempx==0){
	                        z--;
	                    }
	                }
	                 x=x+maxy+max;
	        }
	        return x+z;
	        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= {{1,2},{3,4}};
				//[[1,2],[3,4]]
		System.out.println(projectionArea(grid));
	}

}
