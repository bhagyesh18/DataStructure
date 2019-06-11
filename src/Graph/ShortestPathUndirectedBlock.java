package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*
 * 
 The idea is to BFS (breadth first search) on matrix cells. Note that we can always use 
BFS to find shortest path if graph is unweighted.

> Store each cell as a node with their row, column values and distance from source cell.
Start BFS with source cell.
> Make a visited array with all having “false” values except ‘0’cells which are assigned 
“true” values as they can not be traversed.
> Keep updating distance from source value in each move.
> Return distance when destination is met, else return -1 (no path exists in between source 
and destination). filter_none
 */

class Queue { 
    int rowPos; 
    int colPos; 
    int distance;
	public int getRow() {
		return rowPos;
	}
	public void setRow(int row) {
		this.rowPos = row;
	}
	public int getCol() {
		return colPos;
	}
	public void setCol(int col) {
		this.colPos = col;
	}
	public int getDist() {
		return distance;
	}
	public void setDist(int dist) {
		this.distance = dist;
	}
	public Queue(int row, int col, int dist) {
		super();
		this.rowPos = row;
		this.colPos = col;
		this.distance = dist;
	} 
    
    
}

public class ShortestPathUndirectedBlock {

	
	 
    static int BFS(List<List<Integer>> lot,int rows,int cols) 
    { 
    	boolean[][] visited=new boolean[rows][cols]; 
    		for (int i = 0; i < rows; i++) { 
    	        for (int j = 0; j < cols; j++) 
    	        { 
    	            if (lot.get(i).get(j) == 0) 
    	                visited[i][j] = true; 
    	            else
    	                visited[i][j] = false; 
    	        } 
    	    } 
    	
    	
    	
    	
    	    Queue initPos=new Queue(0,0,0);
        	LinkedList<Queue>  queue=new LinkedList<Queue>(); 
            queue.push(initPos);
            visited[initPos.rowPos][initPos.colPos] = true; 
      
            // BFS
            while (!queue.isEmpty()) { 
                    Queue p = queue.poll();
             
                    if (lot.get(p.getRow()).get(p.getCol()) == 9) 
                        return p.getDist(); 
              
                    if (p.getRow() - 1 >= 0 && 
                        visited[p.getRow() - 1][p.getCol()] == false) { 
                        queue.push( new Queue(p.getRow() - 1, p.getCol(), p.getDist() + 1)); 
                        visited[p.getRow() - 1][p.getCol()] = true; 
                    } 
              
                    if (p.getRow() + 1 < rows && 
                        visited[p.getRow() + 1][p.getCol()] == false) { 
                    	queue.push(new Queue(p.getRow() + 1, p.getCol(), p.getDist() + 1)); 
                        visited[p.getRow() + 1][p.getCol()] = true; 
                    } 
              
                    if (p.getCol() - 1 >= 0 && 
                        visited[p.getRow()][p.getCol() - 1] == false) { 
                    	queue.push(new Queue(p.getRow(), p.getCol() - 1, p.getDist() + 1)); 
                        visited[p.getRow()][p.getCol() - 1] = true; 
                    } 
              
                    if (p.getCol() + 1 < cols && 
                        visited[p.getRow()][p.getCol() + 1] == false) { 
                    	queue.push(new Queue(p.getRow(), p.getCol() + 1, p.getDist() + 1)); 
                        visited[p.getRow()][p.getCol() + 1] = true; 
                    } 
                } 
                return -1;
    }
    
   
     
	
	public static void main(String[] args) {

		List<List<Integer>> listlocation=new ArrayList<List<Integer>>();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(0);
		listlocation.add(list);
		list=new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(0);
		listlocation.add(list);
		list=new ArrayList<Integer>();
		list.add(1);
		list.add(9);
		list.add(1);
		listlocation.add(list);
	   
		/*        1 0 0
		 *        1 0 0
		 *        1 9 1
		 * 
		 * 
		 *      You can travel on 1, 
		 *      0 is block where you can not travel
		 *      9 is the destincation
		 *      
		 *      Here we used the List<List> as Multidimensional Array.
		 *      
		 */
		System.out.println( "Shortest Path is "+BFS(listlocation,3,3));
	}

}
