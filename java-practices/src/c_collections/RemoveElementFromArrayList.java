package c_collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {

		// Get the array
		int[] arr = { 1, 2, 13, 4, 5 };

		// Print the resultant array
		System.out.println("Original Array: " + Arrays.toString(arr));

		// Get the specific index
		int index = 2;

		// Print the index
		System.out.println("Index to be removed: " + index);

		// Remove the element
		arr = removeTheElement(arr, index);

		// Print the resultant array
		System.out.println("Resultant Array: " + Arrays.toString(arr));
	}

	private static int[] removeTheElement(int[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}

		// Create ArrayList from the array
		List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		// Remove the specified element
		arrayList.remove(index);

		// return the resultant array
		return arrayList.stream().mapToInt(Integer::intValue).toArray();

		// return the resultant array
		// return IntStream.range(0, arr.length).filter(i -> i != index).map(i ->
		// arr[i]).toArray();
	}

}
