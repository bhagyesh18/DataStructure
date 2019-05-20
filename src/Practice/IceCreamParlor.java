package Practice;

import java.io.*;
import java.util.*;

//https://www.hackerrank.com/challenges/icecream-parlor/problem

public class IceCreamParlor {

	// Complete the icecreamParlor function below.
	static int[] icecreamParlor(int m, int[] arr) {
		int[] index = new int[2];
		
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(m - arr[i])) {
				index[0] = map.get(m - arr[i]);
				index[1] = i + 1;
				return index;
			}
			map.put(arr[i], i + 1);
		}
		return index;
	}

	public static void main(String[] args) throws IOException {

		int[] arr = { 1, 4, 5, 3, 2 };
		int[] result = icecreamParlor(4, arr);
		System.out.println(result[0]+" "+result[1]);
	}
}
