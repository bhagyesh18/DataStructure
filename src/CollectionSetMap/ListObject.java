package CollectionSetMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sun.net.www.content.text.plain;

class Library{
	private int id;
	private String name;
	public Library(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

public class ListObject {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Library> list=new ArrayList<Library>();
		list.add(new Library(100, "bhagyesh"));
		list.add(new Library(4, "patel"));
		list.add(new Library(5, "sid"));
		list.add(new Library(78, "naitik"));
		list.add(new Library(39, "amit"));
		
    	list.stream().forEach(p -> System.out.println(p.getName()));
    	list.sort(Comparator.comparing(Library::getName));
    	list.stream().forEach(p -> System.out.println(p.getName()));
    
    	
    	
    	
	}

}
