package Graph;

//https://www.geeksforgeeks.org/number-of-triangles-in-directed-and-undirected-graphs/

public class TotalTriangle {

	
	public static int findtotalTriangle(int[][] graph,boolean isDirected) {
		int totalTriangle=0;
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				for (int j2 = 0; j2 < graph.length; j2++) {
					if(graph[i][j]==1 && graph[j][j2]==1 && graph[j2][i]==1) {
						totalTriangle++;
					}
				}
			}
		}
		if(isDirected) {
			totalTriangle=totalTriangle/3;
		}else {

			totalTriangle=totalTriangle/6;
		}
		
		return totalTriangle;
	}
	
	public static void main(String[] args) {
		
		   int graph[][] = {{0, 1, 1, 0}, 
	                        {1, 0, 1, 1}, 
	                        {1, 1, 0, 1}, 
	                        {0, 1, 1, 0} 
	                       }; 
		   
		   //[[0,1], [3,0], [0,2], [3,2], [1,2], [4,0], [3,4], [3,5], [4,5], [1,5], [1,3]]
		   // vertex=6
		   int googleUdgraph[][] = new int[6][6]; 
		   int[][] ver={{0,1}, {3,0}, {0,2}, {3,2}, {1,2}, {4,0}, {3,4}, {3,5}, {4,5}, {1,5}, {1,3}};
		   for (int i = 0; i < ver.length; i++) {
			   	googleUdgraph[ver[i][0]][ver[i][1]]=1;
			   	googleUdgraph[ver[i][1]][ver[i][0]]=1;
		   }
		  
	       int digraph[][] = { {0, 0, 1, 0}, 
	                           {1, 0, 0, 1}, 
	                           {0, 1, 0, 0}, 
	                           {0, 0, 1, 0} 
	                         }; 

		System.out.println(findtotalTriangle(googleUdgraph, false));
	    System.out.println(findtotalTriangle(graph, false));
	    System.out.println(findtotalTriangle(digraph, true));
	 
	    
	 
	}

}
