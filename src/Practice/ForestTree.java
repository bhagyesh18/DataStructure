package Practice;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/even-tree/problem
public class ForestTree {
	 static int[] visited;
	    static int res=0;
	    static int evenForest(int t_nodes, int t_edges, List<Integer> t_from, List<Integer> t_to) {
	          visited=new int[t_nodes];
	          visited[0]=1;
	          int[][] adj=new int[t_nodes][t_nodes];

	          for(int i=0;i<t_nodes;i++){
	              for(int j=0;j<t_nodes;j++){
	                  adj[i][j]=0;
	              }
	          }  

	          for(int i=1;i<=t_nodes;i++){
	              for(int j=0;j<t_to.size();j++){
	                  if(t_to.get(j)==i){
	                      adj[i-1][t_from.get(j)-1]=1;
	                  } 
	              }
	              }  
	          
	           dfs(0,adj);

	          return res;

	    }

	    static int dfs(int n,int[][] adj){
	           int counter=1;
	           visited[n]=1;
	            for(int i=0;i<adj.length;i++){
	                if(visited[i]!=1&&adj[n][i]==1){
	                    int numberofnodes=dfs(i,adj);
	                    if(numberofnodes%2==0){
	                        res++;
	                    }else{
	                        counter+=numberofnodes;
	                    }
	                }
	            }
	        return counter;
	    }




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> tFrom = new ArrayList<>();
        List<Integer> tTo = new ArrayList<>();
        
        tFrom.add(2);
        tFrom.add(3);
        tFrom.add(4);
        tFrom.add(5);
        tFrom.add(6);
        tFrom.add(7);
        tFrom.add(8);
        tFrom.add(9);
        tFrom.add(10);
        tTo.add(1);
        tTo.add(1);
        tTo.add(3);
        tTo.add(2);
        tTo.add(1);
        tTo.add(2);
        tTo.add(6);
        tTo.add(8);
        tTo.add(8);
        
            
        
        
        System.out.print(""+evenForest(10, 9, tFrom, tTo));

        
		
	}

}
