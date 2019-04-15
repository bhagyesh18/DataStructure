import java.util.Scanner;

class Temp{
	int myval;
	
	void getdata(){
		myval=101;
	}
}


public class ArrayDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=7;
		
		int[] data;
		
		Scanner s=new Scanner(System.in);
	//	size=s.nextInt();
		
		data=new int[size];
		System.out.print(data.length);
		
		ArrayDemo ar=new ArrayDemo();
		Integer intobj=new Integer(45);
		Integer intobj2=new Integer(45);
		System.out.println(intobj.equals(intobj2));
		
		ar.checkObj(intobj);
		System.out.print("Hello "+intobj);
	}

	Integer checkObj(Integer intobj){
		//Integer tt=new Integer(5);
		Integer into=intobj;
		into=50;
		return into;
	}
	
}
