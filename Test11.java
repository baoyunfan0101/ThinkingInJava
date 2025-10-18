//: Java/Test11.java
// Thinking in Java
// about interface(Page 316), Object.getClass()(Page 320)
import java.util.*;

interface Instrument {
	int VALUE = 1;	// implicitly static and final
	int getValue();	// automatically public
}

class Piano implements Instrument {
	public int getValue() {	// the method has to be public here, since the method's counterpart in interface is public as default
		return VALUE;
	}
	public String toString() {
		return "Piano";
	}
}

class Violin implements Instrument {
	public int getValue() {
		return VALUE;
	}
	public String toString() {
		return "Violin";
	}
}

public class Test11 {
	public static void main(String[] args) {
		Instrument[] instruments = {new Piano(), new Violin()};
		for (Instrument instrument: instruments)
			System.out.println(instrument.getClass().getSimpleName() + ": " + instrument + ", " + instrument.getValue());
	}
} /* Output:
Piano: Piano, 1
Violin: Violin, 1
*///:~