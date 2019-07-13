package CollectionSetMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


//HashSet:
//unique Elements 
//unsorted
//to reverse convert to list use Collections.API


public class SetProblems {

	public static void main(String[] args) {
		
		Set<Integer> unsortedSet=new HashSet<Integer>();
		unsortedSet.add(87);
		unsortedSet.add(81);
		unsortedSet.add(1);
		unsortedSet.add(-3);
		unsortedSet.add(29);
		System.out.println("Unsorted "+unsortedSet);
		
		
		
		//  Sorting current Set
		unsortedSet=new TreeSet<Integer>(unsortedSet);
		System.out.println("Sorted By TreeSet "+unsortedSet);
		
		
		//Sorted from begining 
		TreeSet<Integer> treesortedSet=new TreeSet<Integer>();
		treesortedSet.add(87);
		treesortedSet.add(81);
		treesortedSet.add(1);
		treesortedSet.add(-3);
		treesortedSet.add(29);
		System.out.println("Sorted TreeSet object of trerSet "+treesortedSet);
		
		
		
		//Create Set object using TreeSet No Difference
		Set<Integer> setTreesortedSet=new TreeSet<Integer>();
		setTreesortedSet.add(87);
		setTreesortedSet.add(81);
		setTreesortedSet.add(1);
		setTreesortedSet.add(-3);
		setTreesortedSet.add(29);
		System.out.println("Sorted Set Object of Treeset "+setTreesortedSet);
		
		
		
		// Reverse Set
		List<Integer> setReverseOrder=new ArrayList<Integer>(setTreesortedSet);
		Collections.reverse(setReverseOrder);
		System.out.println("Reverse Order Set "+setReverseOrder );
				
		// or 
		Collections.reverse(setReverseOrder);
		setTreesortedSet=new LinkedHashSet(setReverseOrder);
		System.out.println("Reverse Order Set "+setTreesortedSet );
		
		
		
		
		Iterator<Integer> iterator= setReverseOrder.iterator();
		while(iterator.hasNext()) {
			System.out.println(">>"+iterator.next());
		}
		Iterator<Integer> listiterator= setReverseOrder.listIterator();
		while(listiterator.hasNext()) {
			System.out.println("--"+listiterator.next());
		}
		
		
		
	}

}
