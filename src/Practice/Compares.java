package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class Compares {
	public static void main(String args[]) {
		String[] cities = { "Bangalore", "Pune", "San Francisco", "New York City" };
		MySort ms = new MySort();
		Arrays.sort(cities, ms);
		
		for (String string : cities) {
			System.out.println(string);
		}
		
		System.out.println(Arrays.binarySearch(cities, "New York City"));
		for (String string : cities) {
			System.out.println(string);
		}
	}

	static class MySort implements Comparator {
		@Override
		public int compare(Object a, Object b) {
			return a.toString().compareTo(b.toString());
		}
		
		
	}
}
