package c_functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumersExample {

	public static void main(String[] args) {
		
		List<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(new Person("siva", 27));
		listOfPerson.add(new Person("raj", 26));
		listOfPerson.add(new Person("sarav", 28));

		listOfPerson.forEach((person) -> {
			System.out.println(" Person name : " + person.getName());
			System.out.println(" Person age : " + person.getAge());
		});

		// Second example
		Consumer<Person> consumer = (person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		};
		consumer.accept(new Person("sankar", 30));
	}
}