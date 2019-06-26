package Exception;

public class ExceptionPropagation5 {

	public void M() {
			int ans=50/0;	
			
	}
	public void N() {
		try {

			M();	
			System.out.println("N next line");
		}catch (Exception e) {
			System.out.println("N()"+e.getMessage());
		}
	}
	public void P() {
		try {

			N();		

			System.out.println("P next line");
		}catch (Exception e) {
			System.out.println("P()"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation5 ep=new ExceptionPropagation5();
		ep.P();
	}

}
