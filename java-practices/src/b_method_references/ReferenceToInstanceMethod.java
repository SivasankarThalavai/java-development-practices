package b_method_references;

import java.util.Arrays;
import java.util.stream.Stream;

interface Sayable {
	void say();
}

public class ReferenceToInstanceMethod {

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public void printThreadMsg() {
		System.out.println("Hello, this is thread instance method");
	}

	public static void main(String[] args) {

		// Creating object
		ReferenceToInstanceMethod methodReference = new ReferenceToInstanceMethod();

		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;

		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object

		// You can use anonymous object also
		Sayable sayable2 = new ReferenceToInstanceMethod()::saySomething;
		// Calling interface method
		sayable2.say();

		Thread t2 = new Thread(new ReferenceToInstanceMethod()::printThreadMsg);
		t2.start();

		
		// printing a String array
		String[] stringArray = { "John", "Mary", "Bob" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(stringArray));

		String[][] deepArray = new String[][] { { "John", "Mary" }, { "Alice", "Bob" } };
		System.out.println(Arrays.toString(deepArray));
		System.out.println(Arrays.deepToString(deepArray));

		// #1
		Arrays.asList(stringArray).stream().forEach(s -> System.out.println(s));

		// #2
		Stream.of(stringArray).forEach(System.out::println);

		// #3
		Arrays.stream(stringArray).forEach(System.out::println);
	}
}