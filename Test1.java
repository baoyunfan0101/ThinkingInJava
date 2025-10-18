//: Java/Test1.java
// Thinking in Java
// about Random(Page 100), Integer.valueOf()(Page 65), Integer.toBinaryString()(Page 109)
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Random rand = new Random(47);	// use 47 as a seed, using the current time if default
		int x = rand.nextInt(100);		// generate a number from 0 to 99
		Integer X = Integer.valueOf(x);	// equivalent to new Interger(x), which is outmoded
		System.out.println(X);
		System.out.println(Integer.toBinaryString(X));
	}
}