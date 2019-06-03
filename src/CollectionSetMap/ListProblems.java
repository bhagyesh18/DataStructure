package CollectionSetMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProblems {

	public static void main(String[] args) {
		
		List<Integer> unsortedList=new ArrayList<Integer>();
		unsortedList.add(324);
		unsortedList.add(1);
		unsortedList.add(23);
		unsortedList.add(12);
		unsortedList.add(23);
		System.out.println("Unsorted List "+unsortedList);
		
		// sort list using Collections API
		Collections.sort(unsortedList);
		System.out.println("Sorted List using Colleciton.sort(list) "+unsortedList);
		
		// sort list using Collections API
		Collections.sort(unsortedList,Collections.reverseOrder());
		System.out.println("Reverse list using Colleciton.sort(list) "+unsortedList);
			
		
		// Streaming the list 
		List<Integer> unsortedStreamList=new ArrayList<Integer>();
		unsortedStreamList.add(324);
		unsortedStreamList.add(1);
		unsortedStreamList.add(23);
		unsortedStreamList.add(12);
		unsortedStreamList.add(23);
		System.out.print("Sorting List using Stream Lambda [");
		unsortedStreamList.stream().sorted().forEach(p-> System.out.print(p+","));
		System.out.print("]"); 
		
		// Traverse in list using stream
		System.out.print("\nTraverse in list using stream Lambda[");
		unsortedStreamList.stream().forEach(p-> System.out.print(p+","));
		System.out.print("]"); 
		
		
		
	}

}
