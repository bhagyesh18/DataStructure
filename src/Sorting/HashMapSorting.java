package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(232,23);
		map.put(2,23);
		map.put(1,23);
		map.put(25,23);
		map.put(89,23);
		
		
		SortedSet<Integer> sss=new TreeSet<Integer>(map.keySet());
		for (Integer integer : sss) {
			System.out.println(integer);
		}
		
		Map<String, Integer> map2=new HashMap<String, Integer>();
		map2.put("ab",23);
		map2.put("aa",23);
		map2.put("aab",23);
		map2.put("zz",23);
		map2.put("ka",23);
		SortedSet<String> sss2=new TreeSet<String>(map2.keySet());
		for (String key : sss2) {
			System.out.println(key);
		}
		
		TreeMap<String, Integer> sorted = new TreeMap<>(map2);
		System.out.println(sorted);
		
		SortedMap<String, Integer>  sortedMap=new TreeMap<String, Integer>();
		sortedMap.put("ab",23);
		sortedMap.put("aa",23);
		sortedMap.put("aab",23);
		sortedMap.put("zz",23);
		sortedMap.put("ka",23);
		System.out.println(sortedMap);
		
		
		SortedMap<Integer, Integer>  sortedMapIn=new TreeMap<Integer, Integer>();
		sortedMapIn.put(12,23);
		sortedMapIn.put(1,23);
		sortedMapIn.put(1,23);
		sortedMapIn.put(29999999,23);
		sortedMapIn.put(9,23);
		System.out.println(sortedMapIn);
		
		
		Set<Integer> setsss=new TreeSet<Integer>();
		setsss.add(100);
		setsss.add(10);setsss.add(1);setsss.add(-2);setsss.add(78);
		for (Integer integer : setsss) {
			System.out.println(integer);
		}
		
		
		
	
		List<Integer> lll=new ArrayList<Integer>();
		lll.add(32);
		lll.add(21);
		lll.add(1);
		lll.add(21341);
		lll.stream().sorted().forEach(p-> System.out.println(p));
		
		
		
		Set<Integer> setReverse=new HashSet<Integer>();
		setReverse.add(21);
		setReverse.add(23);
		setReverse.add(100);
		setReverse.add(99);
		setReverse.add(99);
		List<Integer> listhet=setReverse.stream().sorted().collect(Collectors.toList());
		for (Integer integer : listhet) {
			System.out.println(">>"+integer);
		}
		
		
	}

}
