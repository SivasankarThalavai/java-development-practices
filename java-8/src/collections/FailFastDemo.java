package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {

	public static void main(String[] args) {

		Map<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Sam Hanks", 12345);
		empMap.put("Will Smith", 5687);
		empMap.put("Scarlett", 101112);

		Iterator<String> iterator = empMap.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(empMap.get(iterator.next()));
			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			empMap.put("Istanbul", 74125);
		}
	}
}

/*
 * Output
 * 
 * main 
 * LA 
 * main Exception in thread "main"
 * java.util.ConcurrentModificationException at
 * java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1597) at
 * java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1620) at
 * collections.FailFastDemo.main(FailFastDemo.java:20)
 */

/*
 * From the above output, we can notice the following points:
 * 
 * The Fail Fast iterator throws a ConcurrentModificationException if a
 * collection is modified while iterating over it. 
 * 
 * The Fail Fast iterator uses an original collection to traverse over the collection's elements. 
 * 
 * They are memory savers, don't require extra memory. 
 * 
 * The Fail Fast iterators returned by ArrayList, HashMap, Vector classes.
 */