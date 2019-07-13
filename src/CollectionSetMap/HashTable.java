package CollectionSetMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 * 3533

There are several differences between HashMap and Hashtable in Java:

similar to hashmap but

Hashtable is synchronized, whereas HashMap is not. This makes HashMap better for non-threaded applications, as unsynchronized 
Objects typically perform better than synchronized ones.

Hashtable does not allow null keys or values.  HashMap allows one null key and any number of null values.

One of HashMap's subclasses is LinkedHashMap, so in the event that you'd want predictable iteration order (which is insertion 
order by default), you could easily swap out the HashMap for a  LinkedHashMap. This wouldn't be as easy if you were using Hashtable.

synchronized: https://stackoverflow.com/questions/1085709/what-does-synchronized-mean
The synchronized keyword is all about different threads reading and writing to the same variables, objects and resources. This is not a trivial topic in Java, but here is a quote from Sun:

synchronized methods enable a simple strategy for preventing thread interference and memory consistency errors: if an object is visible to more than one thread, all 
reads or writes to that object's variables are done through synchronized methods.
 */

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashTable=new Hashtable<Integer, String>();
		hashTable.put(123, "bhagyesh");
		hashTable.put(1, "Patel");
		hashTable.put(231, "bhavin");
		hashTable.put(41, "sid");
		hashTable.put(21, "john");
		System.out.println(hashTable);
		
		Hashtable<Integer, String> h1 =   new Hashtable<Integer, String>();
		h1=(Hashtable<Integer, String>) hashTable.clone();
		
		hashTable.computeIfAbsent(89, k-> "tim");
		System.out.println(hashTable);
		
		System.out.println(hashTable.contains("bhagyesh"));
		System.out.println(hashTable.containsKey(41));
		System.out.println(hashTable.containsValue("bhagyesh"));
		
		Enumeration<String> enumVal=hashTable.elements();
		while(enumVal.hasMoreElements()) {
			System.out.println(enumVal.nextElement());
		}
		
		Set set= hashTable.entrySet();
		System.out.println(set);
		
		Set<Map.Entry<Integer, String>> setmapkey= hashTable.entrySet();
		for(Map.Entry<Integer, String> mapkey:setmapkey) {
			System.out.println(mapkey.getKey()+" <> " +mapkey.getValue());
		}
		
		System.out.println(hashTable.get(41));
	
		System.out.println(hashTable.isEmpty());
		
		Enumeration<Integer> keysetenum=hashTable.keys();
	
		while(keysetenum.hasMoreElements()) {
			System.out.println(keysetenum.nextElement());
		}
		
		Set<Integer> setKeys=hashTable.keySet();
		for(Integer key:setKeys) {
			System.out.println(key);
		}
		
		//put if key is absent
		System.out.println(hashTable.putIfAbsent(41,"keri"));
		System.out.println(hashTable);
		System.out.println(hashTable.putIfAbsent(45,"keri"));
		System.out.println(hashTable);
		
		
		Hashtable<Integer, String> h =           new Hashtable<Integer, String>(); 
		h.putAll(hashTable);
		System.out.println(h);
		
		
		
	}

}
