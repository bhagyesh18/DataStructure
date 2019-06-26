import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

         
         
		FileOutputStream file =new FileOutputStream("d:\\serios.ser");
		SerializeEmployee seremployee=new SerializeEmployee();
		seremployee.setEmpl();
		ObjectOutputStream outstream=new ObjectOutputStream(file);
		outstream.writeObject(seremployee);
		outstream.close();
		file.close();
		
		FileInputStream filein=new FileInputStream("d:/serios.ser");
		ObjectInputStream outobject=new ObjectInputStream(filein);
		SerializeEmployee getemployee=(SerializeEmployee)outobject.readObject();
		outobject.close();
		filein.close();
		
		getemployee.printEmployee();
		
		HashMap hashmap=new HashMap();
		hashmap.put("1", "Bhagyesh");
		hashmap.put("2", "Patel");
		hashmap.put("3", "Pratik");
		hashmap.put("4", "Vihaan");
		hashmap.put("6", "Man");
		
		Set ss=hashmap.keySet();
		Iterator ee=ss.iterator();
		while(ee.hasNext()){
			System.out.println(">>"+hashmap.get(ee.next()));
		}
		
		
		
		
		
				
		
		
	}

}
