package o_oops;

// this is a reference variable that refers to the current object.
public class WitOutThisOperator {

	public static void main(String[] args) {

		StudentWithoutThis s1 = new StudentWithoutThis(111, "ankit", 5000f);
		StudentWithoutThis s2 = new StudentWithoutThis(112, "sumit", 6000f);
		s1.display();
		s2.display();

	}

}
