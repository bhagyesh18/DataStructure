/*
 * 
 * Write a java program to find all the leaders in an integer array. An element is said to be a leader if all 
 * the elements on it’s right side are smaller than it. Rightmost element is always a leader. For example, if
{14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array. [Solution]
 */
public class LeaderElement {

	public static void main(String[] args) {
		
		int[] array={14, 9, 11, 7, 8, 5, 3};
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				System.out.println(array[i]);
			}
		}
		
	}

}
