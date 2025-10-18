//: Java/Test10.java
// Thinking in Java
// about abstract(Page 311), downcasting(Page 308), Object.toString()(Page 238, Page 319)
import java.util.*;

abstract class Instrument {
	private static int counter = 0;
	public final int id = counter++;	// keep track of the number of instances of the class(Page 299)
	public abstract int getId();		// abstract method
}

class Piano extends Instrument {
	public int getId() {	// provide definitions for all abstract methods, or qualify the class with abstract as well
		return id;
	}
	public String toString() {	// toString is part of the root class Object, so there's no need to downcast to call it
		return "Piano";
	}
	public void f() {}		// this method CANNOT be called without downcasting
}

class Violin extends Instrument {
	public int getId() {
		return id;
	}
	public String toString() {
		return "Violin";
	}
}

public class Test10 {
	public static void main(String[] args) {
		Instrument[] instruments = {new Piano(), new Violin()};
		for (Instrument instrument: instruments)
			System.out.println(instrument.getId() + ": " + instrument);	// call toString freely
//!		instruments[0].f();				// compile time error!
		((Piano)instruments[0]).f();	// call extended methods through downcasting
	}
} /* Output:
0: Piano
1: Violin
*///:~