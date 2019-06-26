package Exception;

public class ExceptionPropagation3 {

	public void M() {
		try {
			int ans=50/0;	
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("M()"+e.getMessage());
		}
	}
	public void N() {
		M();
	}
	public void P() {
		
			N();	
			System.out.println("Return stack to N");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation3 ep=new ExceptionPropagation3();
		ep.P();
	}

}
