//: Java/Test15.java
// Thinking in Java
// about RuntimeException(Page 469)
import java.util.*;

public class Test15 {
	public void f() throws Exception {
		throw new Exception();
	}
	public void g() {	// there's no need to write an exception specification saying that a method might throw a RuntimeException.
		throw new RuntimeException("RuntimeException in g()");
	}
	public static void main(String[] args) {
		Test15 t = new Test15();
		try {
			t.f();
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
		try {
			t.g();
		} catch(Exception e) {
			System.err.println("Caught an Exception: " + e.getClass().getSimpleName());
		}
		t.g();	// RuntimeExceptions are unchecked exceptions!
		System.out.println("After RuntimeException!");	// program will not reach here.
	}
} /* Output:
java.lang.Exception
        at Test15.f(Test15.java:8)
        at Test15.main(Test15.java:16)
Caught an Exception: RuntimeException
Exception in thread "main" java.lang.RuntimeException: RuntimeException in g()
        at Test15.g(Test15.java:11)
        at Test15.main(Test15.java:25)
*///:~	