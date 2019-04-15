import java.awt.Rectangle;

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			go();
	}

	public static void go()
	{	Rectangle r1 = new Rectangle(0,0,5,5);
		System.out.println("In method go. r1 " + r1 + "\n");
		r1.setSize(10, 15);
		System.out.println("In method go. r1 " + r1 + "\n");
		alterPointee(r1);
		System.out.println("In method go. r1 " + r1 + "\n");
		alterPointer(r1);
		System.out.println("In method go. r1 " + r1 + "\n");
	}
	
//	//Myth: "Objects are passed by reference, primitives are passed by value"
//
//Some proponents of this then say, "Ah, except for immutable objects which are passed by value [etc]" which introduces loads of rules without really tackling how Java works. Fortunately the truth is much simpler:
//
//Truth #1: Everything in Java is passed by value. Objects, however, are never passed at all.
//
//That needs some explanation - after all, if we can't pass objects, how can we do any work? The answer is that we pass references to objects. 
	//That sounds like it's getting dangerously close to the myth, until you look at truth #2:
//
//Truth #2: The values of variables are always primitives or references, never objects.
//
//This is probably the single most important point in learning Java properly. It's amazing how far you can actually get without knowing it, in fact - but vast numbers of things suddenly make sense when you grasp it.
//
//Why is all this important?
//
//When people hear the words "pass by reference", they may understand different things by the words. There are some pretty specific definitions of what it should mean, however. Dale King sometimes quotes this one: "The lvalue of the formal parameter is set to the lvalue of the actual parameter." (Dale's formal analysis of this whole question can be found at the bottom of this page.) This would mean that if you wrote the following code:
//Object x = null;
//giveMeAString (x);
//System.out.println (x);
//[...]
//
//void giveMeAString (Object y)
//{
//    y = "This is a string";
//}
//the result (if Java used pass-by-reference semantics) would be
//
//This is a string
//instead of the actual result:
//
//null
//Explaining the two truths above eliminates all of this confusion.
	
	public static void alterPointee(Rectangle r)
	{	System.out.println("In method alterPointee. r " + r + "\n");
		r.setSize(20, 30);
		System.out.println("In method alterPointee. r " + r + "\n");
	}
	
	
	
	public static void alterPointer(Rectangle r)
	{	System.out.println("In method alterPointer. r " + r + "\n");
		r = new Rectangle(5, 10, 30, 35);
		System.out.println("In method alterPointer. r " + r + "\n");
	}
	
	
	
}
