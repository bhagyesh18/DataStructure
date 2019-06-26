package Exception;

public class ExceptionPropagation4 {

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
			System.out.println("P()"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation4 ep=new ExceptionPropagation4();
		ep.P();
	}

}
