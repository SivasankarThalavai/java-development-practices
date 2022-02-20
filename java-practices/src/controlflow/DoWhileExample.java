package controlflow;

public class DoWhileExample {

	public static void main(String[] args) {

		int i = 1;

		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);

		System.out.println("\nNote: The do block is executed at least once, even if the condition is false.\r\n");

		i = 10;
		do {
			System.out.print(i + " ");
			i = i + 2;
			System.out.print(i + " ");
		} while (false); // 12
	}
}