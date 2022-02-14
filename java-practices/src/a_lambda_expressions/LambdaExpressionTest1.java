package a_lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Default methods of a functional interface cannot be accessed from within lambda expressions.

interface Calculator {

	int add(int a, int b);

	// double avg(int[] array); // The target type of this expression must be a functional interface

}

@FunctionalInterface
interface Average {

	double avg(int[] array);
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

public class LambdaExpressionTest1 {

	private static void printCourse(String course) {
		System.out.println("course name :: " + course);
	}

	public static void main(String[] args) {

		int[] array = { 10, 20 };

		List<String> courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

		// JDK 8 streaming example lambda expression
		courses.stream().forEach(course -> printCourse(course));

		// JDK 8 streaming example method reference
		courses.stream().forEach(LambdaExpressionTest1::printCourse);

		// JDK 8 for each with lambda
		courses.forEach(course -> printCourse(course));

		// JDK 8 for each
		courses.forEach(LambdaExpressionTest1::printCourse);

		// without lambda expression
		Calculator calculator = new Calculator() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}

		};
		System.out.println("without lambda expression - add of (10 + 20 ) : " + calculator.add(10, 20));

		Average average = new Average() {

			@Override
			public double avg(int[] array) {
				double sum = 0;
				int arraySize = array.length;

				for (int i = 0; i < array.length; i++) {
					sum = sum + array[i];
				}
				return (sum / arraySize);
			}
		};
		System.out.println("without lambda expression - avg of (10 + 20 ) : " + average.avg(array));

		// with lambda expression
		// Calculator withLambdaAddable = (a, b) -> (a + b);
		// System.out.println(withLambdaAddable.add(10, 20));

		Calculator withLambdaD = (int a, int b) -> (a + b);
		System.out.println("with lambda expression - add of (10 + 20 ) : " + withLambdaD.add(100, 200));

		Average withLambda = (withLambdaArray) -> {
			double sum = 0;
			int arraySize = withLambdaArray.length;

			for (int i = 0; i < withLambdaArray.length; i++) {
				sum = sum + withLambdaArray[i];
			}

			return (sum / arraySize);
		};

		System.out.println("with lambda expression- avg of (10 + 20 ) : " + withLambda.avg(array));

		// without lambda, Runnable implementation using anonymous class
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Starting a thread Runnable without lambda exp.");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		// with lambda
		Runnable withThreadLambda = () -> System.out.println("Starting a thread Runnable Runnable with lambda exp.");
		Thread thread1 = new Thread(withThreadLambda);
		thread1.start();

		List<Person> listOfPerson = new ArrayList<Person>();
		listOfPerson.add(new Person("siva", 30));
		listOfPerson.add(new Person("sarav", 35));
		listOfPerson.add(new Person("raj", 28));
		listOfPerson.add(new Person("raghul", 30));

		// Without lambda expression Sort list by age
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		};

		Collections.sort(listOfPerson, comparator.reversed());

		System.out.println(" sort persons by age in descending order");
		for (Person person : listOfPerson) {
			System.out.println(" Person name : " + person.getName());
		}

		// Witht lambda expression.
		// Sort list by age

		Collections.sort(listOfPerson, (Person o1, Person o2) -> {
			return o1.getAge() - o2.getAge();
		});
		// Use forEach method added in java 8
		System.out.println(" sort persons by age in ascending order");
		listOfPerson.forEach((person) -> System.out.println(" Person name : " + person.getName()));
	}

}