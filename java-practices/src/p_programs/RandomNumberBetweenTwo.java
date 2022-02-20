package p_programs;

public class RandomNumberBetweenTwo {

	public static void main(String[] args) {

		int min = 200, max = 400;

		System.out.println("Random value of type double between " + min + " to " + max + ":");

		double a = Math.random() * (max - min + 1) + min;
		System.out.println(a);

		double b = Math.random() * (max - min) + min;
		System.out.println(b);

		double c = Math.random() * min;
		System.out.println(c); // raNDOME

		double d = Math.random() * max;
		System.out.println(d);// raNDOME

	}

}
