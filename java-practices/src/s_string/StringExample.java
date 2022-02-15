package s_string;

public class StringExample {

	public static void main(String args[]) {

		// 1) String Literal
		// String objects are stored in a special memory area known as the "string
		// constant pool".
		String s1 = "java";
		String s2 = "java"; // It doesn't create a new instance. only one object will be created for both.
		System.out.println(s1);
		System.out.println(s2); // will return the reference to the same instance 1.

		// 2) By new keyword
		// heap memory, pool constants
		String s3 = new String("Welcome");// creates two objects and one reference variable
		System.out.println(s3);

		// 3.) immutable
		// is not changed but a new object is created with siva , sivasankar
		String s = "siva";
		s.concat(" sankar");// concat() method appends the string at the end
		System.out.println(s);// will print siva because strings are immutable objects

		s = s.concat(" sankar");
		System.out.println(s);

		// 4.) equals method
		String s4 = "Sarav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false

		// 5.) By Using == operator
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)

		// 6) String Concatenation by + (String concatenation) operator
		String s5 = "siva" + " sankar";
		// The Java compiler transforms above code to this:
		// String s=(new StringBuilder()).append("siva").append("sankar).toString();
		System.out.println(s5);

		// Note: After a string literal, all the + will be treated as string concatenation operator.
		String s6 = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s6);// 80Sachin4040
		
	}
}