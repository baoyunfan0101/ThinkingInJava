//: Java/Test7.java
// Thinking in Java
// about final(Page 262)
import java.util.*;

class TestClass1 {
	static final int INT_1 = 1;
}

class TestClass2 {
	static final int INT_2;
	static {
		INT_2 = 2;
	}
}

class TestClass3 {
	static final int INT_3 = 0;	// This static final variable CANNOT be initialized in a constructor.
	final int INT_4;
	TestClass3() {
//!		INT_3 = 3;	// You CANNOT initialize a static final variable here!
		INT_4 = 4;	// You can initialize a blank final variable here in a constructor.
	}
}

public class Test7 {
	public static final int[] ARRAY = {1, 2, 3,};
	public void f(final int i) {
//!		i++;	// You CANNOT change a final argument.
	}
	public static void main(String[] args) {
		System.out.println("INT_1 = " + TestClass1.INT_1);
		System.out.println("INT_2 = " + TestClass2.INT_2);
		System.out.println("INT_3 = " + TestClass3.INT_3);
		TestClass3 t3 = new TestClass3();
		System.out.println("INT_4 = " + t3.INT_4);
		ARRAY[0]++;
//!		ARRAY = new int[3];	// You CANNOT rebind a final reference to another object!
		System.out.println("ARRAY[0] = " + ARRAY[0]);
	}
} /* Output:
INT_1 = 1
INT_2 = 2
INT_3 = 0
INT_4 = 4
ARRAY[0] = 2
*///:~