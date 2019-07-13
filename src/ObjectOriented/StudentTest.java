package ObjectOriented;
import java.util.HashMap;
import java.util.Map;

/**
 * Fix the following code so the the map.get() call
 * retrieves the expected value.
 * Do not change the main method.
 */
public class StudentTest {
    public static final class Student {
        public Student( String name ) {
            this.name = name;
        }
        private String name;
        
        @Override
        public boolean equals(Object obj) {
        	if(obj==null)
        		return false;
        	if(!(obj instanceof Student))
        			return false;
        	if(obj==this)
        		return true;
        	
        	Student std=(Student)obj;
        	if(std.name==this.name) {
        		return true;
        	}else {
        		return false;
        	}
        }
        
        @Override
        public int hashCode() {
        	// TODO Auto-generated method stub
        	return name.hashCode();
        }
        
    }

    public static void main(final String[] args ) {
        Map<Student, String> map = new HashMap<>();
        map.put( new Student( "john"), "present" );
        System.out.println( map.get( new Student( "john" ) ) );
        System.out.println(new Student("patel").hashCode());
        System.out.println(new Student("patel").hashCode());
    }
}