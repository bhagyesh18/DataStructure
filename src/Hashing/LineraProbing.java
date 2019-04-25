package Hashing;

/*
 * 
 * Collision resolution strategy
Linear probing is applied to resolve collisions. In case the slot, indicated by hash function, 
has already been occupied, algorithm tries to find an empty one by probing consequent slots in the array. 

Note. Linear probing is not the best techique to be used when table is of a constant size. When load 
factor exceeds particular value (appr. 0.7), hash table performance 
will decrease nonlinearly. Also, the number of stored key-value pairs is limited to the size of the table (128).
 */

//http://www.algolist.net/Data_structures/Hash_table

class HashTable{
	int key;
	int val;
	
	public HashTable() {
	}
	
	public HashTable(int key, int val) {
		this.key = key;
		this.val = val;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
}

public class LineraProbing {
		
	static int size;
	static HashTable hashtable[];

	public LineraProbing() {
	
	}
	
	public LineraProbing(int size) {
		this.size=10;
		hashtable=new HashTable[size];
		for(int i=0;i<size;i++) {
			hashtable[i]=null;
		}
	}
	
	static void put(int key, int val) {
		int hash=hashfunction(key);
		while(hashtable[hash]!=null&& hashtable[hash].getKey()!=key){
			hash=hashfunction(hash+1);
		}
		hashtable[hash]=new HashTable(key, val);
	}
	
	static int get(int key) {
		int hash=hashfunction(key);
		while(hashtable[hash]!=null&& hashtable[hash].getKey()!=key){
			hash=hashfunction(hash+1);
		}
		 if (hashtable[hash] == null)
             return -1;
       else
             return hashtable[hash].getVal();
	}
	
	static int hashfunction(int val) {
		return val%size;
	}

	public static void main(String args[]) {
		LineraProbing lp=new LineraProbing(10);
		put(1,18);
		put(2,18);
		put(3,18);
		put(4,18);
		put(5,18);
		put(11,18);
		put(12,18);
		System.out.println(get(12));
		
		
		
	}
	
	
}
