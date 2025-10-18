//: Java/Test14.java
// Thinking in Java
// about finally(Page 473), Cleanup(Page 483), Exception matching(Page 489)
import java.util.*;

class Exception1 extends Exception {}

class Exception2 extends Exception {}

public class Test14 {
	public void f(int n) throws Exception {
		switch(n) {
			case 1: throw new Exception1();
			case 2: throw new Exception2();
			default: return;
		}
	}
	public static void main(String[] args) {
		Test14 t = new Test14();
		try {
			try {
				t.f(1);
			} catch(Exception e) {
				System.err.println("Caught " + e + "in inner catch clause.");
				throw e;	// rethrow e, or outer catch clause CANNOT catch it(since it has been solved here).
			}
		} catch(Exception e) {
			System.err.println("Caught " + e + "in outer catch clause.");
		}
		System.err.println("----------");
		for(int n = 0; n < 3; n++) {
			try {
				t.f(n);
			} catch(Exception1 e) {
				System.err.println("Caught an Exception1: " + e.getClass().getSimpleName());
			} catch(Exception2 e) {
				System.err.println("Caught an Exception2: " + e.getClass().getSimpleName());
			} catch(Exception e) {	// there must be a catch clause to catch the exception exactly the same as exception specification, and it must appear at last here.(Page 490)
				System.err.println("Caught an Exception: " + e.getClass().getSimpleName());
			} finally {
				System.err.println("n = " + n + " in finally clause.");
			}
		}
	}
} /* Output:
Caught Exception1in inner catch clause.
Caught Exception1in outer catch clause.
----------
n = 0 in finally clause.
Caught an Exception1: Exception1
n = 1 in finally clause.
Caught an Exception2: Exception2
n = 2 in finally clause.
*///:~	