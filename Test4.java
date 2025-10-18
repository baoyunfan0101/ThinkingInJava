//: Java/Test4.java
// Thinking in Java
// about static(Page 172), initialization(Page 186, Page 272)
import java.util.*;

class TestClass {
	static int testClassStaticInt = initClassStaticInt();	// this static variable is initialized when static method f is called, or rather, its class is involved(Page 188, Page 272)
	static int initClassStaticInt() {
		System.out.println("testClassStaticInt is initialized!");
		return 0;
	}
	TestClass() {	// this contructor is NOT called sense TestClass is NOT instantiated
		System.out.println("TestClass costructor starts!");
	}
	static void f() {	// You can call a static method WITHOUT instantiating the class.
		System.out.println("TestClass.f() execute!");
	}
}

public class Test4 {
	int testInt = initInt();	// local variables are initialized ONLY IF the class is instantiated
	int initInt() {
		System.out.println("testInt is initialized!");
		return 0;
	}
	static int testStaticInt = initStaticInt();	// static variables, just as global variables, are initialized REGARDLESS OF whether the class is instantiated
	static int initStaticInt() {
		System.out.println("testStaticInt is initialized!");
		return 0;
	}
	Test4() {	// a contructor is called ONLY IF the class is instantiated
		System.out.println("Test4 costructor starts!");
	}
	public static void main(String[] args) {
//		new Test4();	// if this statement is uncommented, the local variable testInt will be initialized and the constructor Test4 will be called
		TestClass.f();	// if this statement is commented out, the static variable testClassStaticInt will NOT be initialized
	}
} /* Output:
testStaticInt is initialized!
testClassStaticInt is initialized!
TestClass.f() execute!
*///:~