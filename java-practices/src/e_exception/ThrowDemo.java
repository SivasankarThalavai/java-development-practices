package e_exception;

public class ThrowDemo {

	public static void validate(int age) {

		if (age < 18) {
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String[] args) {

		try {
			validate(13);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
	}

}
