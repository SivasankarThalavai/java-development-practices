package c_functional_interfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[] args) {

		// anonymous class implements BiPredicate interface
		BiPredicate<String, String> predicateObject = new BiPredicate<String, String>() {

			@Override
			public boolean test(String s1, String s2) {
				return s1.equals(s2);
			}
		};
		System.out.println(predicateObject.test("siva", "siva"));

		// Lambda expression implementation
		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		System.out.println(biPredicate.test("siva", "siva"));
		System.out.println(biPredicate.test("Sankar ", "sankar"));
	}
}