package p_programs;

public class FactorialIterativeDemo {

	public static void main(String[] args) {

		int fact = 1, number = 5;
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);

	}

	private static int factorial(int number) {

		if (number == 0) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
