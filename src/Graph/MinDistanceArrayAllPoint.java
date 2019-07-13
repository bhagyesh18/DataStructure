package Graph;

import java.util.LinkedList;

public class MinDistanceArrayAllPoint {

	 static class Point{
	        int r;
	        int c;
	        public Point(int row,int col){
	            r=row;
	            c=col;
	        }
	    }
	    
	    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
	        
	        int[][] result=new int[(R*C)][2];
	        int[][] visited=new int[R][C];
	        LinkedList<Point> queue=new LinkedList<Point>();
	        
	        Point p=new Point(r0,c0);
	        queue.add(p);
	        visited[r0][c0]=1;
	        int index=0;
	        while(queue.size()!=0){
	            
	            Point current=queue.poll();
	            result[index][0]=current.r;
	            result[index][1]=current.c;
	            index++;
	            // Up
	            if((current.r-1)>=0){
	                if(visited[current.r-1][current.c]!=1){
	                    queue.add(new Point(current.r-1,current.c));
	                    visited[current.r-1][current.c]=1;
	                }
	            }
	            //down
	            if((current.r+1)<R){
	                 if(visited[current.r+1][current.c]!=1){
	                    queue.add(new Point(current.r+1,current.c));
	                     visited[current.r+1][current.c]=1;
	                }
	            }
	            // left
	            if((current.c-1)>=0){
	                 if(visited[current.r][current.c-1]!=1){
	                    queue.add(new Point(current.r,current.c-1));
	                     visited[current.r][current.c-1]=1;
	                }
	            }
	            // right
	            if((current.c+1)<C){
	                 if(visited[current.r][current.c+1]!=1){
	                    queue.add(new Point(current.r,current.c+1));
	                     visited[current.r][current.c+1]=1;
	                }
	            }
	        }
	     
	        return result;
	    }
	
	public static void main(String[] args) {
		
		int[][] result=allCellsDistOrder(2, 3, 1, 2);
		
		for (int i = 0; i < result.length; i++) {
				System.out.println("["+result[i][0]+","+  result[i][1] +"]");
		}
	
	}

}

