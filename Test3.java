//: Java/Test3.java
// Thinking in Java
// about overloading(Page 158), this(Page 167)
import java.util.*;

class Tree {
	int height = 0;	// You can do the assignment here.
	Tree() {	// a constructor is public when default
//!		System.out.println("constructor started");	// this call must be the first statement in a constructor
		this(0);	// call another constructor
	}
	Tree(int height) {
		this.height = height;	// distinguish the member date and the argument with the same name
		System.out.println("height initialized to " + height);
	}
	void grow(int height) {
		System.out.println("this.height = " + this.height);
		System.out.println("height = " + height);
		this.height += height;
		System.out.println("after growing..");
		System.out.println("this.height = " + this.height);
	}
}

public class Test3 {
	public static void main(String[] args) {
		Tree t1 = new Tree();
		t1.grow(1);
	}
}