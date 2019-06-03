package Collection;

import java.io.*; 
import java.util.*; 

//This class represents a directed graph using adjacency list 
//representation 
class DFS 
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency Lists 

	// Constructor 
	DFS(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	// Function to add an edge into the graph 
	void addEdge(int v,int w) 
	{ 
		adj[v].add(w); 
	} 

	// prints BFS traversal from a given source s 
	void DFS(int s) 
	{ 
		boolean visitors[] = new boolean[V]; 
		DFSUtil(s, visitors);
		
	} 

	void DFSUtil(int s,boolean[] visitor) {
		
		visitor[s]=true;
		System.out.println(s);
		
		Iterator<Integer> it=adj[s].listIterator();
		while(it.hasNext()) {
			s=it.next();
			if(!visitor[s]) {
				DFSUtil(s, visitor);
			}
		}
	}
	
	// Driver method to 
	public static void main(String args[]) 
	{ 
		DFS g = new DFS(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 
		
		
		

		System.out.println("Following is Breadth First Traversal "+ 
						"(starting from vertex 2)"); 

	//	g.BFSown(2); 
		
	
		
	} 
} 
//This code is contributed by Aakash Hasija 
