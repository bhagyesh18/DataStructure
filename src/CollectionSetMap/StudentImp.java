package CollectionSetMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// leetcode Employee Importance

class Student {
	 public int id;
	 // the importance value of this employee
	 public int importance;
	 // the id of direct subordinates
	 public List<Integer> subordinates;
	};
	
public class StudentImp {
	 int sum=0;
	 Map<Integer,Student> map=new HashMap<Integer,Student>();
	 public int getImportance(List<Student> student, int id) {
	     for(Student e:student){
	         map.put(e.id,e);
	     }
	     recursion(map.get(id));
	     return sum;
	 }
	 
	 public void recursion(Student emp){
	     sum+=emp.importance;
	     if(emp.subordinates.size()!=0){
	         List<Integer> subordinates=emp.subordinates;
	         for(Integer empID: subordinates){
	             recursion(map.get(empID));
	         }
	     }
	     return;
	 }
	public static void main(String[] args) {
		
	}

}

