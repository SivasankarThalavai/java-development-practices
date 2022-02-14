package d_streams_api;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreationExamples {

	public static void main(String[] args) throws IOException {

		Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);

		List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);

		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);

		// Array can also be a source of a Stream
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
		streamOfArray.forEach(System.out::println);

		// creating from existing array or of a part of an array:
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);

		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		streamOfArrayPart.forEach(System.out::println);
	}
}