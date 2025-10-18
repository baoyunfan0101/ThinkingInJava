//: Java/Test5.java
// Thinking in Java
// about array(Page 193), Arrays.toString()(Page 195)
import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		int[] a1 = new int[new Random(47).nextInt(20)];			// initialized to 0
		System.out.println(Arrays.toString(a1));
		Integer[] a2 = new Integer[new Random(47).nextInt(20)];	// initialized to null
		System.out.println(Arrays.toString(a2));
		int[] a3 = {1, 2, 3,};
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(new int[] {1, 2, 3,}));
	}
} /* Output:
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
[1, 2, 3]
[1, 2, 3]
*///:~