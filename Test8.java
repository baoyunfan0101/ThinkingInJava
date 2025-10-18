//: Java/Test8.java
// Thinking in Java
// about containers(Page 398)
/* Collection	->	List	->	ArrayList
 *							->	LinkedList
 *				->	Set		->	HashSet		->	LinkedHashSet
 *							->	TreeSet
 * Map			->	HashMap	->	LinkedHashMap
 *				->	TreeMap
*/
import java.util.*;

public class Test8 {
	static void fCollection(Collection c) {}
	public static void main(String[] args) {
		List l = new ArrayList();	// upcasting, ArrayList is a List
		l = new LinkedList();		// upcasting, LinkedList is a List
		fCollection(l);				// List is a Collection
		Set s = new HashSet();		// upcasting, HashSet is a Set
		s = new TreeSet();			// upcasting, TreeSet is a Set
		fCollection(s);				// Set is a Collection
		HashSet hs = new LinkedHashSet();	// upcasting, LinkedHashSet is a HashSet
		Map p = new HashMap();		// upcasting, HashMap is a Map
		p = new TreeMap();			// upcasting, TreeMap is a Map
		HashMap hm = new LinkedHashMap();	// upcasting, LinkedHashMap is a HashMap
	}
} /* Output:
*///:~