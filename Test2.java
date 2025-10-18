//: Java/Test2.java
// Thinking in Java
// about foreach(Page 140), String.toCharArray()(Page 141)
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String s = "HelloWorld!";
		for(char c : s.toCharArray())
			System.out.print(c + ", ");
	}
}