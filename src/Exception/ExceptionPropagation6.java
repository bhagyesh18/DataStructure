package Exception;

public class ExceptionPropagation6 {

	public void M() throws Exception{
			int ans=50/0;	
			
	}
	public void N() throws Exception {
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
		ExceptionPropagation6 ep=new ExceptionPropagation6();
		ep.P();
	}

}
