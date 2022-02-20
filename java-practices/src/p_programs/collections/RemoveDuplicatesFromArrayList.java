package p_programs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 2, 42, 1, 3, 6, 0));
		System.out.println("ArrayList with duplicate elements: " + numbers);

		// convert the arraylist into a set
		// Set<Integer> set = new LinkedHashSet<>(); // It provides an insertion order;
		// we can predict the order
		Set<Integer> set = new TreeSet<>(); // 0, 1, 2, 3, 6, 11, 42
		set.addAll(numbers);

		// delete al elements of arraylist
		numbers.clear();
		numbers.addAll(set);

		System.out.println("ArrayList without duplicate elements: " + numbers);

		// using streams
		numbers = (ArrayList<Integer>) numbers.stream().distinct().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("ArrayList without duplicate elements: " + numbers);

	}

}
