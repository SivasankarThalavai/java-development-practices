package p_programs;

import java.util.Scanner;

//	Note: 0 and 1 are not prime numbers. 
//	The 2 is the only even prime number because all the other even numbers can be divided by 2.

public class PrimeNumberDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the first number : ");
		int start = s.nextInt();

		System.out.print("Enter the second number : ");
		int end = s.nextInt();

		System.out.println("List of prime numbers between " + start + " and " + end);

		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		s.close();
	}

	private static boolean isPrime(int number) {

		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
