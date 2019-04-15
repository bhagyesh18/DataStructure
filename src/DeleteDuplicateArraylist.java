import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class DeleteDuplicateArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList subject=new ArrayList();
			subject.add("java");
			subject.add("jsp");
			subject.add("java");
			HashSet hashsubject=new HashSet(subject);
			ArrayList newArl=new ArrayList(hashsubject);
			System.out.println(newArl);
			
		
		
	}

}
