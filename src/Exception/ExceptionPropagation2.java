package Exception;

public class ExceptionPropagation2 {

	public void M() {
		int ans=50/0;
	}
	public void N() {
		M();
	}
	public void P() {
			N();	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation2 ep=new ExceptionPropagation2();
		ep.P();
	}

}
