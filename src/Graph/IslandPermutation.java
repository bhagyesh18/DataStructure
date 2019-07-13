package Graph;

// https://leetcode.com/problems/island-perimeter/
public class IslandPermutation {

	class Solution {
	    
		public int islandPerimeter(int[][] grid) {
	        int per=0;
	        int row=grid.length;
	        int col=grid[0].length;
	        int temp=0;
	        int perTemp=0;
	        for(int i=0;i<row;i++){
	            perTemp=0;
	            for(int j=0;j<col;j++){
	                temp=0;
	                if(grid[i][j]==1){
	                            temp=4;
	                            // up
	                            if((i-1)>=0){
	                                if(grid[i-1][j]==1)
	                                        temp--;    
	                            }

	                            // down
	                            if((i+1)<row){
	                                 if(grid[i+1][j]==1)
	                                     temp--;
	                            }

	                            // left
	                            if((j-1)>=0){
	                                if(grid[i][j-1]==1)
	                                    temp--;
	                            }

	                            // right
	                            if((j+1)<col){
	                                if(grid[i][j+1]==1)
	                                    temp--;
	                            }
	                }
	                perTemp=perTemp+temp;       
	            }
	            per=per+perTemp;
	        }
	        return per;
	        
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="ABCABD";
		System.out.println(name.replace("AB", ""));
		
	}

}
