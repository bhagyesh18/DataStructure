package Hashing;

//http://www.algolist.net/Data_structures/Hash_table/Chaining

class HashLinkedList{
	int key;
	String name;
	HashLinkedList next;
	
	public HashLinkedList() {
		
	}
	
	public HashLinkedList(int key, String name) {
		this.key = key;
		this.name = name;
		this.next=null;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HashLinkedList getNext() {
		return next;
	}
	public void setNext(HashLinkedList next) {
		this.next = next;
	}
	
	
	
}

public class Chaining {

	static HashLinkedList hashtable[];
	static int size;
	
	public Chaining(int size) {
		    this.size=size;
			hashtable=new HashLinkedList[size];
	}
	
	public void put(int key,String name) {
		int hash=hashFunction(key);
		if(hashtable[hash]==null) {
			hashtable[hash]=new HashLinkedList(key,name);
		}else {
			HashLinkedList entry=hashtable[hash];
			while(entry.next!=null && entry.getKey()!=key) {
				entry=entry.getNext();
			}
			if(entry.getKey()==key) {
				entry.setName(name);
			}else {
				entry.setNext(new HashLinkedList(key,name));
			}
		}
	}
	
	public HashLinkedList get(int key) {
		int hash=hashFunction(key);
		if(hashtable[hash]==null) {
			return null;
		}else {
			HashLinkedList entry=hashtable[hash];
			while(entry.next!=null && entry.getKey()!=key) {
				entry=entry.getNext();
			}
			if(entry.getKey()==key) {
				return entry;
			}else {
				return null;
			}
		}
	}
	
	public void remove(int key) {
		int hash=hashFunction(key);
		if(hashtable[hash]==null) {
			System.out.println("Nothing to remove");
		}else {
			HashLinkedList entry=hashtable[hash];
			HashLinkedList parent=hashtable[hash];
			while(entry.next!=null && entry.getKey()!=key) {
				parent=entry;
				entry=entry.getNext();
			}
			if(entry.getKey()==key) {
				parent.setNext(entry.getNext());
			}else {
				System.out.println("Nothing to remove");
			}
		}
	}
	
	
	public int hashFunction(int key) {
		return key%size;
	}
	
	public static void main(String[] args) {
	  Chaining chain=new Chaining(10);
	  chain.put(1, "Bhagyesh");
	  chain.put(2, "sid");
	  chain.put(12, "john");
	  chain.put(3, "tom");
	  chain.put(4, "dil");
	  chain.put(111, "man");
	  chain.put(12, "siddharth");
	  
	  System.out.println(chain.get(111).getName());
	  
	  System.out.println(chain.get(12).getName());
	  
	  chain.remove(12);
	  chain.remove(1123);
	  System.out.println(chain.get(111).getName());
	}

}
