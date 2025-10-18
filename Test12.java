//: Java/Test12.java
// Thinking in Java
// about anonymous inner classes(Page 356), identifiers(Page 387)
import java.util.*;

class Piano {
	Piano() {
		System.out.println("Piano default constructor!");
	}
	Piano(String s) {
		System.out.println("Piano constructor with a String = " + s + "!");
	}
	int f(int n) {
		System.out.println("Piano f() with an int = " + n + "!");
		return n;
	}
}

class Instrument {
	public Piano makePiano(String s) {	// the argument reference of an object is required to be final if it's used WITHIN the anonymous class!
		return new Piano(s) {	// an anonymous inner class, and there will be a file named Instrument$1.class
			{ System.out.println("Anonymous inheritor initialization!"); }	// while you can't define a constructor(since the anonymous class hasn's got a name), you can use the initializer here!
			int f(int n) {
				System.out.println("Anonymous inheritor f() with an int = " + n + "!");
				return super.f(n) + 1;
			}
		};	// this syntax actually means to create an object of an anonymous class inherited from Piano!
	}
	public Piano getPiano(String s) {
		return new Piano(s);
	}
}

public class Test12 {
	public static void main(String[] args) {
		Instrument i = new Instrument();
		System.out.println("Instrument.makePiano()");
		System.out.println("Create an object of an anonymous class inherited from Piano.");
		Piano p1 = i.makePiano("makePiano");
		System.out.println("The rusult is " + p1.f(0) + ".");
		System.out.println("Instrument.getPiano()");
		System.out.println("Create an object of Piano.");
		Piano p2 = i.getPiano("getPiano");
		System.out.println("The rusult is " + p2.f(0) + ".");
	}
} /* Output:
Instrument.makePiano()
Create an object of an anonymous class inherited from Piano.
Piano constructor with a String = makePiano!
Anonymous inheritor initialization!
Anonymous inheritor f() with an int = 0!
Piano f() with an int = 0!
The rusult is 1.
Instrument.getPiano()
Create an object of Piano.
Piano constructor with a String = getPiano!
Piano f() with an int = 0!
The rusult is 0.
*///:~