package p_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayListDemo {

	public static void main(String[] args) {

		// create an arraylist from the array

		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
		List<String> cities = new ArrayList<>(Arrays.asList(citynames));

		int[] ints = { 1, 2, 3, 2, 5, 1 };
		List<Integer> numbers = new ArrayList<Integer>(ints.length);
		for (int i : ints) {
			numbers.add(i);
		}

		// convert the arraylist into a set
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(numbers);

		// delete al elements of arraylist
		numbers.clear();

		// add element from set to arraylist
		numbers.addAll(set);
		System.out.println("ArrayList without duplicate elements: " + numbers);
	}

}
