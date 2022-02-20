package helloworld;

/*	
 * Java is a statically-typed programming language. 
   It means, all variables must be declared before its use. 
   That is why we need to declare variable's type and name.
   
*/
public class VariableDemo {

	static int m = 100;// static variable

	void method() {

		int n = 90;// local variable
	}

	public static void main(String[] args) {

		int data = 50;// instance variable

		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);

		float f = a; // Java Variable Example: Widening
		System.out.println(a);
		System.out.println("Widening : " + f);

		// Java Variable Example: Narrowing (Typecasting)

		float f1 = 10.5f;
		// int a=f; Compile time error
		int a1 = (int) f1;
		System.out.println(f1);
		System.out.println(a1);

		// Overflow
		int a2 = 130;
		byte b2 = (byte) a2;
		System.out.println(a2);
		System.out.println(b2);

		byte a3 = 10;
		byte b3 = 10;
		// byte c=a+b;//Compile Time Error: because a+b=20 will be int
		byte c3 = (byte) (a3 + b3);
		System.out.println(c3);

	}

}
