package CollectionSetMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// https://howtodoinjava.com/java-sorting-guide/


public class MapProblems {

	  private static HashMap sortByValues(Map<Integer, Integer> unsortedValuemap) { 
	       List list = new LinkedList(unsortedValuemap.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	            	System.out.println(((Map.Entry) (o1)) +"  "+((Map.Entry) (o2)));
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	    
	       
	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
	
	public static void main(String[] args) throws Exception {
		Map<Integer, Integer> unsortedKeymap=new HashMap<Integer, Integer>();
		unsortedKeymap.put(232,23);
		unsortedKeymap.put(2,23);
		unsortedKeymap.put(1000,23);
		unsortedKeymap.put(25,23);
		unsortedKeymap.put(89,23);
		
		// Traverse 
		System.out.println("Traverse using stream");
		unsortedKeymap.keySet().stream().sorted().forEach(p->System.out.println(p));
				
		
		// Unsorted HashMap 
		System.out.println("Unsorted HashMap "+unsortedKeymap);
		
		// Sort HashMap Key using TreeSet
		unsortedKeymap=new TreeMap<Integer, Integer>(unsortedKeymap);
		System.out.println("Sorted hashmap BY KEY using TreeMap Object "+unsortedKeymap);
		
		// Sorted HashMap Key from Begining using TreeMap
		TreeMap<Integer, Integer> treemapSorted=new TreeMap<Integer, Integer>();
		treemapSorted.put(232,23);
		treemapSorted.put(2,23);
		treemapSorted.put(1000,23);
		treemapSorted.put(25,23);
		treemapSorted.put(89,23);
		System.out.println("Sorted HashMap BY KEY from Begining using TreeMap "+treemapSorted);
		
		
		

		
		// By Value 
		Map<Integer, Integer> unsortedValuemap=new HashMap<Integer, Integer>();
		unsortedValuemap.put(232,3);
		unsortedValuemap.put(2,1);
		unsortedValuemap.put(1000,234);
		unsortedValuemap.put(25,2);
		unsortedValuemap.put(89,2);		
		
		
		
		unsortedValuemap=sortByValues(unsortedValuemap);
		System.out.println("Sorted By Value "+unsortedValuemap);
		
		
		// other way to sort by value using linkedhashmap with lambda functioin
		//LinkedHashMap preserve the ordering of elements in which they are inserted
		HashMap<Integer, String> unSortedMap = new HashMap<>();
		unSortedMap.put(50, "Alex");
		unSortedMap.put(20, "Charles");
		unSortedMap.put(60, "Brian");
		unSortedMap.put(70, "Edwin");
		unSortedMap.put(120, "George");
		unSortedMap.put(10, "David");

		//LinkedHashMap preserve the ordering of elements in which they are inserted
		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
		 
		unSortedMap.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByValue())
		    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		
		
		Set<Integer> listkey=sortedMap.keySet();
		for (Integer integer : listkey) {
			System.out.println(integer);
		}
		
		// Temp
		HashMap<Integer, Integer> unSortedMapInt = new HashMap<>();
		unSortedMapInt.put(50, 324);
		unSortedMapInt.put(20, 214);
		unSortedMapInt.put(60, 363263);
		unSortedMapInt.put(70, 12215);
		unSortedMapInt.put(120, 26);
		unSortedMapInt.put(10, 2);
		
		System.out.println(unSortedMapInt);
		LinkedHashMap<Integer, Integer> sortedMapInt = new LinkedHashMap<>();
		unSortedMapInt.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByValue())
		    .forEachOrdered(x -> sortedMapInt.put(x.getKey(), x.getValue()));
		System.out.println(sortedMapInt);
		
		Set<Integer> listkey2=sortedMapInt.keySet();
		for (Integer integer : listkey2) {
			System.out.println(integer);
		}
		
		Iterator<Integer> itt= unSortedMapInt.keySet().iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		
		Set<Map.Entry<Integer, Integer>> setEntry= unSortedMapInt.entrySet();
		System.out.println(setEntry);
		for(Map.Entry<Integer, Integer> me: setEntry) {
			System.out.println(me.getKey() +"<>"+me.getValue());
		}
		for(Map.Entry<Integer, Integer> me: unSortedMapInt.entrySet()) {
			System.out.println(me.getKey() +"<>"+me.getValue());
		}

		
		
		System.out.println( Collections.max(unSortedMapInt.values()));
		System.out.println(Collections.max(unSortedMapInt.keySet()));
		
	}
	

	

}
