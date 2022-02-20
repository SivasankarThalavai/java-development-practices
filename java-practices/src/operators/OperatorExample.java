package operators;

public class OperatorExample {

	public static void main(String args[]) {

		// Java Unary Operator ++ and --

		int x = 1;
		System.out.println("x : " + x + "\n");

		System.out.println("x++ in same line : " + x++); // 1 (2)
		System.out.println("x++ in next line x : " + x + "\n"); // (2)

		x = 1;
		System.out.println("x : " + x + "\n");
		System.out.println("++x in same line : " + ++x); // 2
		System.out.println("x++ in next line : " + x + "\n");

		int y = 1;
		System.out.println("y : " + y + "\n");

		System.out.println("y-- in same line : " + y--); // 1 (0)
		System.out.println("y-- in next line y : " + y + "\n"); // (0)

		y = 1;
		System.out.println("--y in same line : " + --y); // 0
		System.out.println("--y in next line y : " + y + "\n"); // (0)

		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);// 10+12=22
		System.out.println(b++ + b++);// 10+11=21

		// Java Unary Operator Example: ~ and !

		boolean c = true;
		boolean d = false;

		a = 10;
		b = -10;

		System.out.println(~a);// -11 (minus of total positive value which starts from 0)
		System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

		// Java Arithmetic Operator

		a = 10;
		b = 5;

		System.out.println(a + b);// 15
		System.out.println(a - b);// 5
		System.out.println(a * b);// 50
		System.out.println(a / b);// 2
		System.out.println(a % b);// 0

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

		// Java Left Shift Operator Example

		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(10 << 4);// 10*2^4=20*16=160
		System.out.println(15 << 4);// 15*2^4=15*16=240

		// Java Right Shift Operator Example
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2

		// Java AND Operator Example: Logical && and Bitwise &

		/*
		 * The logical && operator doesn't check the second condition if the first
		 * condition is false. It checks the second condition only if the first one is
		 * true.
		 * 
		 * The bitwise & operator always checks both conditions whether first condition
		 * is true or false.
		 */

		a = 10;
		b = 5;
		int c1 = 20;

		System.out.println(a < b && a < c1);// false = false
		System.out.println(a < b && a++ < c1);// false = false
		System.out.println(a);// 10 because second condition is not checked

		System.out.println(a < b & a < c1);// false & true = false
		System.out.println(a < b & a++ < c1);// false && true = false
		System.out.println(a);// 11 because second condition is checked

		// Java Ternary Operator Example

		int min = (a < b) ? a : b;
		System.out.println(min);

		// Java Assignment Operator Example

		a += 4;// a=a+4 (a=11+4)
		b -= 4;// b=b-4 (b=5-4)
		System.out.println(a);
		System.out.println(b);
	}
}