package p_programs.collections;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToArrayListConversion {

	// Function to get ArrayList from Stream
	public static <T> ArrayList<T> getArrayListFromStream(Stream<T> stream) {

		// Convert the Stream to List
		// List<T> list = stream.collect(Collectors.toList());

		// Create an ArrayList of the List
		// ArrayList<T> arrayList = new ArrayList<T>(list);

		// Convert the Stream to ArrayList
		ArrayList<T> arrayList1 = stream.collect(Collectors.toCollection(ArrayList::new));

		// Return the ArrayList
		return arrayList1;
	}

	// Driver code
	public static void main(String args[]) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		// Convert Stream to ArrayList in Java
		ArrayList<Integer> arrayList = getArrayListFromStream(stream);

		// Print the arraylist
		System.out.println("ArrayList: " + arrayList);
	}
}
