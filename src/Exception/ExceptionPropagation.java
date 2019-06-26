package Exception;

public class ExceptionPropagation {

	public void M() {
		int ans=50/0;
	}
	public void N() {
		M();
	}
	public void P() {
		
		try {

			N();	
		}catch (Exception e) {
			System.out.println("P() "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation ep=new ExceptionPropagation();
		ep.P();
	}

}
