package o_oops.abstractclass;

// It cannot be instantiated just like the abstract class.

// Since Java 8, we can have default and static methods in an interface.

// Since Java 9, we can have private methods in an interface.

// It can be used to achieve loose coupling.

interface Shape1 {

	// Declare fields
	String objectName = "";

	// static methods
	public static void moveTo(int x, int y) {
		System.out.println("static method " + objectName + " " + "has been moved to" + " x = " + x + " and y = " + y);
	}

	// deafult methods
	public default void dragTo(int x, int y) {
		System.out
				.println("deafult method " + objectName + " " + "has been dragged to" + " x = " + x + " and y = " + y);
		move(x, y);
	}

	// private methods
	private void move(int x, int y) {
		System.out
				.println("private method " + objectName + " " + "has been dragged to" + " x = " + x + " and y = " + y);
	}

	// Abstract methods
	double area();

}

interface Shape2 {

	void draw();
}

interface Shape3 {

	void draw1();
}

class Rectangle1 implements Shape1, Shape2, Shape3 {

	int length, width;

	// Constructor
	Rectangle1(int length, int width) {
		// this keyword refers to current instance itself
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle has been drawn ");
	}

	@Override
	public double area() {
		return (double) (length * width);
	}

	@Override
	public void draw1() {
		// TODO Auto-generated method stub

	}
}

class Circle1 implements Shape1, Shape2, Shape3 {

	// Attributes of a Circle
	double pi = 3.14;
	int radius;

	Circle1(int radius) {
		// This keyword refers to current instance itself
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle has been drawn ");
	}

	@Override
	public double area() {
		return (double) ((pi * radius * radius));
	}

	@Override
	public void draw1() {

	}
}

public class InterfaceDemo {

	public static void main(String args[]) {

		// Creating the Object of Rectangle class and using shape class reference.
		Shape1 reactShape = new Rectangle1(2, 3);
		System.out.println("Area of rectangle: " + reactShape.area());

		// Calling deafult MEthod of Shape interface with rectanle ref

		reactShape.dragTo(0, 0);

		// Calling Static MEthod of Shape interface
		Shape1.moveTo(1, 2);
		System.out.println(" ");

		// Creating the Objects of circle class
		Shape1 circle = new Circle1(2);
		System.out.println("Area of circle: " + circle.area());

	}
}
