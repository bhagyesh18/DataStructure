package CollectionSetMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//https://howtodoinjava.com/java-sorting-guide/

/*
 * Many times we face situation where we do not seek natual ordering or class file unavilable for
 *  edit due to legacy code issue. In this case, we can take help of Comparator interface.

Comparator does not require to modivy the sourcecode of the class. We can create the comparison 
logic in seperate class which implement Comparator interface and override it’s compare() method.
 Then pass this comparator to sort() methods along with list of custom objects.
 */

class NameSorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
	    return o1.getName().compareToIgnoreCase(o2.getName());
	}
}

public class SortObjectinList {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
		list.add(new Employee(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)));
		list.add(new Employee(3l, "Piyush", LocalDate.of(2018, Month.APRIL, 25)));
		list.add(new Employee(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23)));
		list.add(new Employee(2l, "Pawan", LocalDate.of(2018, Month.APRIL, 24)));
		Collections.sort(list);
		System.out.println(list);
	
		Collections.sort(list,new NameSorter());
		System.out.println(list);
		
		list.stream().forEach(p-> System.out.println(p.getName()));
		
		
		list = new ArrayList<>();
		list.add(new Employee(1l, "Alex", LocalDate.of(2018, Month.APRIL, 21)));
		list.add(new Employee(4l, "Brian", LocalDate.of(2018, Month.APRIL, 22)));
		list.add(new Employee(3l, "Piyush", LocalDate.of(2018, Month.APRIL, 25)));
		list.add(new Employee(5l, "Charles", LocalDate.of(2018, Month.APRIL, 23)));
		list.add(new Employee(2l, "Pawan", LocalDate.of(2018, Month.APRIL, 24)));
		
		// using lambda 
		Comparator<Employee> nameSorter = (a, b) -> a.getName().compareToIgnoreCase(b.getName());
        Collections.sort(list, nameSorter);
		// or 
        Collections.sort(list,(e1,e2)-> e1.getName().compareToIgnoreCase(e2.getName()));
    	System.out.println(list);
		
        
	}

}
