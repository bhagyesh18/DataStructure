package ShortestPath;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class QueueXYD {
	int rowPosition;
	int colPosition;
	int distance;

	public QueueXYD(int rowPosition, int colPosition, int distance) {
		super();
		this.rowPosition = rowPosition;
		this.colPosition = colPosition;
		this.distance = distance;
	}

	public int getRowPosition() {
		return rowPosition;
	}

	public void setRowPosition(int rowPosition) {
		this.rowPosition = rowPosition;
	}

	public int getColPosition() {
		return colPosition;
	}

	public void setColPosition(int colPosition) {
		this.colPosition = colPosition;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}

public class ShortestSourceDestUndirected {

	public static int findShortestPathBFS(int[][] amazonwarehouse, int sourceX, int sourceY,int destX,int destY) {
		int rows=amazonwarehouse.length;
		int cols=amazonwarehouse[0].length;
		boolean[][] visited = new boolean[rows][cols];
				
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (amazonwarehouse[i][j] == 0) {
					visited[i][j] = true;
				}else {
					visited[i][j] = false;
				}
			}
		}

		QueueXYD source = new QueueXYD(sourceX, sourceY, 0);
		LinkedList<QueueXYD> listQueue = new LinkedList<QueueXYD>();
		listQueue.add(source);

		while (!listQueue.isEmpty()) {
			QueueXYD currentQueue = listQueue.poll();
			
			System.out.println(currentQueue.getRowPosition() +" "+currentQueue.getColPosition()+" "+currentQueue.getDistance());
			
			// found
			if (currentQueue.getRowPosition()==destX && currentQueue.getColPosition()==destY) {
				return currentQueue.getDistance();
			}

			// up
			if (currentQueue.getRowPosition() - 1 >= 0) {
				if (visited[currentQueue.getRowPosition()-1][currentQueue.getColPosition()] == false) {
					listQueue.add(new QueueXYD(currentQueue.getRowPosition()-1, currentQueue.getColPosition(), currentQueue.getDistance()+1));
					visited[currentQueue.getRowPosition()-1][currentQueue.getColPosition()] = true;
				}
			}

			// down
			if (currentQueue.getRowPosition() + 1 < rows) {
				if (visited[currentQueue.getRowPosition()+1][currentQueue.getColPosition()] == false) {
					listQueue.add(new QueueXYD(currentQueue.getRowPosition()+1, currentQueue.getColPosition(), currentQueue.getDistance()+1));
					visited[currentQueue.getRowPosition()+1][currentQueue.getColPosition()] = true;
				}
			}

			// left
			if (currentQueue.getColPosition() - 1 >= 0) {
				if (visited[currentQueue.getRowPosition()][currentQueue.getColPosition()-1] == false) {
					listQueue.add(new QueueXYD(currentQueue.getRowPosition(), currentQueue.getColPosition()-1, currentQueue.getDistance()+1));
					visited[currentQueue.getRowPosition()][currentQueue.getColPosition()-1] = true;
				}
			}

			// right
			if (currentQueue.getColPosition() + 1 < cols) {
				if (visited[currentQueue.getRowPosition()][currentQueue.getColPosition()+1] == false) {
					listQueue.add(new QueueXYD(currentQueue.getRowPosition(), currentQueue.getColPosition()+1, currentQueue.getDistance()+1));
					visited[currentQueue.getRowPosition()][currentQueue.getColPosition()+1] = true;
				}
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int[][] amazonwarehousr=new int[3][3];
		amazonwarehousr[0][0]=1;
		amazonwarehousr[0][1]=0;
		amazonwarehousr[0][2]=1;
		amazonwarehousr[1][0]=1;
		amazonwarehousr[1][1]=0;
		amazonwarehousr[1][2]=1;
		amazonwarehousr[2][0]=1;
		amazonwarehousr[2][1]=1;
		amazonwarehousr[2][2]=1;
		
	   
		/*        1 0 1
		 *        1 0 1
		 *        1 1 1
		 * 
		 * 
		 *      You can travel on 1, 
		 *      0 is block where you can not travel
		 *      9 is the destincation
		 *      
		 *      Here we used the List<List> as Multidimensional Array.
		 *      
		 */
		System.out.println( "Shortest Path is "+ findShortestPathBFS(amazonwarehousr,2,2,0,0));
		
		
	}

}
