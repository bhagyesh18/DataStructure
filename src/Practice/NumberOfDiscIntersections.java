package Practice;

public class NumberOfDiscIntersections {

	private static int solution(int[] points) {
		int counter = 0;

		try {
		
	
		long[][] radius = new long[points.length][2];
		for (int i = 0; i < points.length; i++) {
			radius[i][1] = i + Long.valueOf(points[i]);
			radius[i][0] = i - Long.valueOf(points[i]);
		}

		int[][] visited = new int[points.length][points.length];

		for (int i = 0; i < radius.length; i++) {
			for (int k = 0; k < radius.length; k++) {
				if (k != i) {
					if (radius[i][0] <=radius[k][0] && radius[i][1]>=radius[k][0]) {
						if (visited[k][i] == 0) {
							visited[i][k] = 1;
							counter++;
						} else {
						}
					}
				}
			}
		}
		

		return counter;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		return counter;
	}

	public static void main(String[] args) {

		int[] points = {1, 2147483647, 0};
    	System.out.println(solution(points));

    	
	}

}
