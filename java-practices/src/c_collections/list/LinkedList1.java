package c_collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String args[]) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ravi");
		ll.add("Ajay");

		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Adding an element at the specific position
		ll.add(1, "Gaurav");
		System.out.println(ll);

		// Adding an element at the first position
		ll.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: " + ll);

		// Adding an element at the last position
		ll.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: " + ll);

		// Removing specific element from arraylist
		ll.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + ll);

		// Removing element on the basis of specific position
		ll.remove(0);
		System.out.println("After invoking remove(index) method: " + ll);

		// Removing first element from the list
		ll.removeFirst();
		System.out.println("After invoking removeFirst() method: " + ll);

		// Removing first element from the list
		ll.removeLast();
		System.out.println("After invoking removeLast() method: " + ll);

		// Removing first occurrence of element from the list
		ll.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking removeFirstOccurrence() method: " + ll);

		// Removing last occurrence of element from the list
		ll.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: " + ll);

		// Removing elements on the basis of specified condition
		ll.removeIf(str -> str.contains("Ravi")); // Here, we are using Lambda expression
		System.out.println("After invoking removeIf() method: " + ll);

		// Removing all the elements available in the list
		ll.clear();
		System.out.println("After invoking clear() method: " + ll);

		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Ravi");
		ll1.add("Vijay");
		ll1.add("Ajay");

		// Traversing the list of elements in reverse order
		Iterator<String> i = ll1.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}
}