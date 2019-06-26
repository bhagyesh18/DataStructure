package Exception;

import java.io.IOException;

public class ExceptionPropagation7 {

	
	@SuppressWarnings("finally")
	public void P() {
		try {
				throw new ArithmeticException("bhagyesh");
		}catch (Exception e) {
			throw new NullPointerException();
		}finally {
			throw new StringIndexOutOfBoundsException();
		}
	}
	
	public void Q() {
		try {
				int x=0;
				int ans=5/x;
		}
		catch ( ArithmeticException e) {
			System.out.println("ArithException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}finally {
		}
	}
	
	public void R() throws IOException {
		try {
				int x=0;
				int ans=5/x;
		}
		catch (ArithmeticException e) {
			System.out.println("ArithException");
			throw new StringIndexOutOfBoundsException();
		}
		finally {
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExceptionPropagation7 ep=new ExceptionPropagation7();
		//ep.P();
		//ep.R();
	}

}
