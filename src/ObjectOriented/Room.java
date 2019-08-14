package ObjectOriented;
import java.io.IOException;

class Building {
	
	int id;
	public void getMessage() throws IOException {
		System.out.println("Building Object");
	}
	
	
}
class Office2 extends Building {
	int id;
	public void getMessage() throws IOException {
		System.out.println("ofice Object");
	}
	
	
}



public class Room extends Building {

	@Override
	public void getMessage() throws IOException {
			
		try {
			System.out.println("Room Object");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static class OOO{
		public void ddsfsdf() {
			System.out.println("sadfsdfsadga");
		}
	}
	
	public static void main(String[] args) throws IOException {
		
	Float f=new Float(3.0);
	int x=f.intValue();
	byte b=f.byteValue();
	double d=f.doubleValue();
	System.out.println(x+b+d);
	
	
	
	OOO o=new OOO();
	o.ddsfsdf();
	
	try {

		convert("a");	
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("sdsdsdgsd");
	}
	}

	
	static int convert(String aa) {
		
		try {
			return Integer.parseInt(aa);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("fsdfsdfs");
		}
		return 1;
	}
}
