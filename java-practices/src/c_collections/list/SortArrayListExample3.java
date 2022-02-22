package c_collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListExample3 {

	public static void main(String args[]) {

		// creating object of ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		list.add("Data Science");
		list.add("Testing");
		list.add("C#");
		list.add("Basic Language");
		list.add("UML");
		list.add("Algorithms ");
		list.add("Computer Networks");
		list.add("Python");

		System.out.println("Before Sorting: " + list);

		// Sorting ArrayList in ascending Order
		// using Collection.sort() method
		Collections.sort(list, Collections.reverseOrder());

		// Print the sorted ArrayList
		System.out.println("After Sorting: " + list);
	}
}