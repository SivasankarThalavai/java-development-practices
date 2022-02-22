package c_collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample1 {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist

		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Mango");
		list.add("Grapes");

		// Printing the arraylist object
		System.out.println(list);

		// Traversing list through Iterator
		Iterator<String> itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}

		// Traversing list through for-each loop
		for (String fruit : list)
			System.out.println(fruit);

		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0

		// changing the element
		list.set(1, "Dates");

		// Traversing list
		for (String fruit : list)
			System.out.println(fruit);

		// Sorting the list
		Collections.sort(list);

		// Traversing list through the for-each loop
		for (String fruit : list)
			System.out.println(fruit);

		System.out.println("\nTraversing list through List Iterator:");

		// Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}

		System.out.println("\nTraversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("\nTraversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("\nTraversing list through forEachRemaining() method:");
		Iterator<String> itr1 = list.iterator();
		itr1.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Anuj");
		System.out.println("An initial list of elements: " + al);

		// Removing specific element from arraylist
		al.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + al);

		al.remove(0);
		System.out.println("After invoking remove(index) method: " + al);

		// Creating another arraylist
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");

		// Adding new elements to arraylist
		al.addAll(al2);
		System.out.println("Updated list : " + al);

		// Removing all the new elements from arraylist
		al.removeAll(al2);

		System.out.println("After invoking removeAll() method: " + al);

		// Removing elements on the basis of specified condition
		al.removeIf(str -> str.contains("Anuj")); // Here, we are using Lambda expression
		System.out.println("After invoking removeIf() method: " + al);

		// Removing all the elements available in the list
		al.clear();
		System.out.println("After invoking clear() method: " + al);

		System.out.println("Is ArrayList Empty: " + al.isEmpty());

		/*
		 * Java ArrayList example of retainAll() method
		 */
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Ravi");
		al3.add("Vijay");
		al3.add("Ajay");

		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Ravi");
		al4.add("Hanumat");
		al4.add(null);
		al4.add(null);

		al3.retainAll(al4);

		// Adding an element at the specific position
		al3.add(1, "Gaurav");
		System.out.println(al3);

		System.out.println("iterating the elements after retaining the elements of al2");

		Iterator<String> itr3 = al3.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
	}
}