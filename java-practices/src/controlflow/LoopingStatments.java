package controlflow;

public class LoopingStatments {

	public static void main(String[] args) {

		int i = 0;

		// Java while loop

		System.out.println("Printing the list of first 10 even numbers \n");
		while (i <= 10) {
			System.out.print(i + " ");
			i = i + 2;
		} // 0 2 4 6 8 10

		// Java do-while loop

		System.out.println("\nPrinting the list of first 10 even numbers \n");
		i = 0;
		do {
			System.out.print(i + " ");
			i = i + 2;
		} while (i <= 10); // 0 2 4 6 8 10

		// The break statement example with for loop
		System.out.println("\nThe break statement example with for loop \n");
		for (int j = 0; j <= 10; j++) {

			System.out.print(j + " "); // 0 1 2 3 4 5 6

			if (j == 6) {
				break;
			}
		}

		// / The break statement example with labeled for loop
		System.out.println("\nbreak statement example with labeled for loop\n");

		a: for (int i1 = 0; i1 <= 10; i1++) {

			b: for (int j1 = 0; j1 <= 15; j1++) {

				c: for (int k = 0; k <= 20; k++) {
					System.out.print(k + " ");
					if (k == 5) {
						break a;
					}
				}
			}
		} // 0 1 2 3 4 5

		System.out.println("\nbreak statement example with nested for loop with continue \n");

		/*
		 * 0 1 2 3 5 1 2 3 5 2 3 5
		 */
		for (int i2 = 0; i2 <= 2; i2++) { //

			for (int j2 = i2; j2 <= 5; j2++) {

				if (j2 == 4) {
					continue;
				}
				System.out.print(j2 + " ");
			}
			System.out.println();
		}
	}

}