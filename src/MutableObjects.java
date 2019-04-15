/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

Explanation:
1. Concat1 : In this method, we pass a string “Geeks” and perform “s1 = s1 + ”forgeeks”. The string passed from main() is not changed, this is due to the fact that String is immutable. Altering the value of string creates another object and s1 in concat1() stores reference of new string. References s1 in main() and cocat1() refer to different strings.

2. Concat2 : In this method, we pass a string “Geeks” and perform “s2.append(“forgeeks”)” which changes the actual value of the string (in main) to “Geeksforgeeks”. This is due to the simple fact that StringBuilder is mutable and hence changes its value.

2. Concat3 : StringBuffer is similar to StringBuilder except one difference that StringBuffer is thread safe, i.e., multiple threads can use it without any issue. The thread safety brings a penalty of performance.
When to use which one :

If a string is going to remain constant throughout the program, then use String class object because a String object is immutable.
If a string can change (example: lots of logic and operations in the construction of the string) and will only be accessed from a single thread, using a StringBuilder is good enough.
If a string can change, and will be accessed from multiple threads, use a StringBuffer because StringBuffer is synchronous so you have thread-safety.


*******************************************************************************/

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
