package c_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {

		BiFunction<Person, Person, List<Person>> biFunction = (p1, p2) -> {
			List<Person> persons = new ArrayList<>();
			persons.add(p1);
			persons.add(p2);
			return persons;
		};

		List<Person> persons = biFunction.apply(new Person("siva", 30), new Person("sankar", 20));
		System.out.println(Arrays.toString(persons.toArray()));

	}
}