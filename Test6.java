//: Java/Test6.java
// Thinking in Java
// about Object.toString()(Page 238), extends(Page 241), main()(Page 242), super(Page 243)
import java.util.*;

class TestClass {
	private int i = 0;
	public String toString() {
		System.out.println("TestClass.toString() executed!");
		return "TestClass.toString() return value";
	}
	public static void main(String[] args) {
		System.out.println("TestClass.main executed!");
	}
}

public class Test6 extends TestClass {	// inherited from TestClass
	public String toString() {
		System.out.println("Test6.toString() executed!");
		System.out.println("super.toString(): " + super.toString());
		return "Test6.toString() return value";
	}
	public static void main(String[] args) {
		Test6 t = new Test6();
		System.out.println(t);
//!		super.main(args);	// You CANNOT use this or super in a static method!
		TestClass.main(args);
	}
} /* Output:
Test6.toString() executed!
TestClass.toString() executed!
super.toString(): TestClass.toString() return value
Test6.toString() return value
TestClass.main executed!
*///:~