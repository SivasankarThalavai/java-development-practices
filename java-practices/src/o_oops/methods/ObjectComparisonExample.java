package o_oops.methods;

// Objects are identical when they share the class identity.

// == operator compares that two references are identical or not.

public class ObjectComparisonExample {

	public static void main(String[] args) {

		Double x = 123.45555D;
		Double y = 123.45555D;
		Long y1 = 12L;

		System.out.println(x.equals(y));
		System.out.println(x.equals(123.45555));

		int x1 = 123;
		float y2 = 123;
		System.out.println(x1 == y2);
	}

}