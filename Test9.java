//: Java/Test9.java
// Thinking in Java
// about List.listIterator(Page 409)
import java.util.*;

public class Test9 {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(0, 1, 2, 3, 4, 5);
//!		l.add(6);	// Runtime error! The return of Arrays.asList is an array, it CANNOT be resized!
		l = new ArrayList<Integer>(l);
		l.add(6);	// An ArrayList can be resized.
		System.out.println("l: " + l);
		ListIterator<Integer> it = l.listIterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
//!		System.out.println(it.next());	// Runtime error!
		while(it.hasPrevious())
			System.out.print(it.previous() + " ");
		System.out.println();
//!		System.out.println(it.previous());	// Runtime error!
	}
} /* Output:
l: [0, 1, 2, 3, 4, 5, 6]
0 1 2 3 4 5 6
6 5 4 3 2 1 0
*///:~