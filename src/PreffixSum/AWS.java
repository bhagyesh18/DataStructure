package PreffixSum;

import java.util.ArrayList;
import java.util.List;

public class AWS {

	public static void cellCompete(int[] states, int days) {

		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < states.length; i++) {
			result.add(0);
		}

		for (int i = 1; i <= days; i++) {

			for (int j = 0; j < states.length; j++) {
				if (j == 0) {
					result.set(j, 0 ^ states[j + 1]);
				} else if (j == states.length - 1) {
					result.set(j, states[j - 1] ^ 0);
				} else {
					result.set(j, states[j - 1] ^ states[j + 1]);
				}
			}

			int index = 0;
			for (Integer integer : result) {
				states[index] = integer;
				index++;
			}

		}

		for (Integer integer : result) {
			System.out.println(integer);
		}

	}

	static int[] smallest2(List<Integer> listParts) {
		int[] min2 = new int[2];

		int first, second, list_size = listParts.size();
		first = second = Integer.MAX_VALUE;
		for (int i = 0; i < list_size; i++) {
			if (listParts.get(i) <= first) {
				second = first;
				first = listParts.get(i);
			}

			else if (listParts.get(i) < second && listParts.get(i) != first)
				second = listParts.get(i);
		}

		min2[0] = first;
		min2[1] = second;
		return min2;

	}

	static int minimumTime(int numOfParts, List<Integer> parts) {

		int min1 = 0, min2 = 0, result = 0;

		while (parts.size() > 2) {
			int[] minRes = smallest2(parts);
			min1 = minRes[0];
			min2 = minRes[1];
			int temp = min1 + min2;

			result += temp;

			System.out.println("min1 " + min1 + "min2 " + min2 + " temp" + temp);
			parts.remove(parts.indexOf(min1));
			parts.remove(parts.indexOf(min2));
			parts.add(temp);
		}
		min1 = parts.get(0) + parts.get(1);
		result += min1;
		return result;
	}

	public static void main(String[] args) {

	

	}

}
