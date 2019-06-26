package ObjectOriented;
import java.util.ArrayList;
import java.util.List;

interface Pancake{
	List<Integer> dostuff(List<Integer> z);
	
}
public class ListProblem implements Pancake{

	public static void main(String[] args) {
			List<Integer> x=new ArrayList<Integer>();
			x.add(1);x.add(2);x.add(3);
			System.out.println(x);
			List<Integer> y=new ListProblem().dostuff(x);
			y.add(4);
			System.out.println(x);

			System.out.println(y);
		
	}
	
	public List<Integer> dostuff(List<Integer> z){
		z.add(100);
		return z;
	}

}
