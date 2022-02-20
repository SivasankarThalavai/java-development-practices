package c_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayToArrayListConversion {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		List<Integer> numbers = new ArrayList<>(arr.length);
		for (int i : arr) {
			numbers.add(i);
		}
		System.out.println(numbers.toString());

		// Converting primitive integer array to an Integer array
		Integer[] boxedArray1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		System.out.println(boxedArray1.toString());

		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, boxedArray1);
		System.out.println(list.toString());

		// using Stream
		List<Integer> numbers1 = Arrays.stream(arr).boxed().toList();
		System.out.println(numbers1.toString());

		List<Integer> numbers2 = IntStream.of(arr) // returns IntStream
				.boxed().collect(Collectors.toList());
		System.out.println(numbers2.toString());

		// Converting primitive integer array to an Integer array
		Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		System.out.println(boxedArray.toString());

		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));
		System.out.println(citylist.toString());

		ArrayList<String> arraylist = new ArrayList<String>();
		Collections.addAll(arraylist, citynames);
		System.out.println(citylist.toString());

	}

}
