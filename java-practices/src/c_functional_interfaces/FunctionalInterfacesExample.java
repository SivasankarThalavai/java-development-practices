package c_functional_interfaces;

import java.util.function.Predicate;

// An Interface that contains exactly one abstract method is known as a functional interface.
// It can have any number of default, static methods but can contain only one abstract method. 
// It can also declare the methods of the object class.
// functional interface can extend another interface only when it does not have any abstract method

@FunctionalInterface
interface Sayable {

	void say(String msg); // abstract method

}

public class FunctionalInterfacesExample {

	public static void main(String[] args) {

		// with Lambda
		Sayable sayable = (msg) -> {
			System.out.println(msg);
		};
		sayable.say("Say something ..");

		// PRedicate is one function accepting a single argument to evaluate a boolean result.
		Predicate<Person> predicate = (person) -> person.getAge() > 28;
		boolean result = predicate.test(new Person("siva", 29));
		System.out.println(result);
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}