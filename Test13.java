//: Java/Test13.java
// Thinking in Java
// about exceptions(Page 499), System.err(Page 450), Throwable.printStackTrace()(Page 451)
import java.util.*;

class MyException extends Exception {
	public MyException() {}
	public MyException(String msg) { super(msg); }
}

public class Test13 {
	public void f() throws MyException {
		throw new MyException("Originated in f()");
	}
	public static void main(String[] args) {
		Test13 t = new Test13();
		try {
			t.f();
		} catch(MyException e) {
			System.err.println("Caught an exception!");
			e.printStackTrace(System.err);
		}
	}
} /* Output:
Caught an exception!
MyException: Originated in f()
        at Test13.f(Test13.java:13)
        at Test13.main(Test13.java:18)
*///:~