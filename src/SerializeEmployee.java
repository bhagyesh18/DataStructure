import java.io.Serializable;

public class SerializeEmployee implements  java.io.Serializable{

	private int id;
	private String name;
	
	public void printEmployee(){
		System.out.print("ID"+id+"name"+name);
	}
	
	public void setEmpl(){
		id=10;
		name="bhagyesh";
	}
	
}
