
class Student{
    
    private String id;
    private String name;
    
    public String getname(){
        return name;
    }
    
    public String setname(String newname){
        this.name=newname;
        return name;
        
    }
}

class Entrol{
    
    private Student student;
    
    public void updatename(Student s){
        s.setname("PATEL");
    }

}

class StringOperationMutable {
	
	public void concateString(String str) {
		str=str.concat("Patel");
	}
	
	public void concateStringBuilder(StringBuilder sbl) {
		sbl.append("Shah");
	}

	public void concateStringBuffer(StringBuffer sbf) {
		sbf.append("Jani");
	}
}


public class MutableObjects
{
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		Student st=new Student();
		System.out.println("OLD NAme:"+st.setname("bhagyesh"));
		
		Entrol en=new Entrol();
		en.updatename(st); 
		System.out.println("OLD NAme:"+st.getname());
		
		
		String name="Bhagyesh";
		StringBuilder sbl=new StringBuilder("Sid");
		StringBuffer sbf=new StringBuffer("siddhi");
		
		StringOperationMutable sobj=new StringOperationMutable();
		sobj.concateString(name);
		sobj.concateStringBuilder(sbl);
		sobj.concateStringBuffer(sbf);

		System.out.println("String Val: "+name);
		System.out.println("String Builder Val: "+sbl);
		System.out.println("String Buffer Val"+sbf);
	
	}
}
