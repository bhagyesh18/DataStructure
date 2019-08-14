package ObjectOriented;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

interface A{
	void a();
	void b();
}

class ClassA implements A{
	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Class A a()");
	}
	@Override
	public void b() {
		// TODO Auto-generated method stub

		System.out.println("Class A b()");
	}
	
	public void getMessage() {
		System.out.println("Class A says Hi");
	}
	
}

interface B extends A{
	void c();
	void d();
}

interface X{
	void y();
	void z();
	
	interface xyz{
		void xy();
	}
}

class nested implements X{
	@Override
	public void y() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void z() {
		// TODO Auto-generated method stub
		
	}
}

abstract class AbstractA implements A{
	abstract void c();
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
	public void definedMethod() {
		
	}
}

class BInterface implements B,A {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceAbstract extends AbstractA{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AbstractList<Integer> al=new ArrayList<Integer>();
			
			List<Integer> llll=new ArrayList<Integer>();
			
			
			
			A classa=new ClassA();
			classa.a();
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void c() {
		// TODO Auto-generated method stub
		
	}
	
}
