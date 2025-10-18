//: Java/Test16.java
// Thinking in Java
// about Object.toString()(Page 509)
import java.util.*;

public class Test16 {
	public String toString() {
//!		return "Test16 address: " + this;	// Exceptions! Trying to covert this to a string produces a recursive call!
		return "Test16 address: " + super.toString();
	}
	public static void main(String[] args) {
		Test16 t = new Test16();
		System.out.println(t);
		List<Test16> l = new ArrayList<Test16>();
		for(int i = 0; i < 3; i++)
			l.add(new Test16());
		System.out.println(l);
	}
} /* Output:
Test16 address: Test16@5caf905d
[Test16 address: Test16@5b2133b1, Test16 address: Test16@72ea2f77, Test16 address: Test16@33c7353a]
*///:~	