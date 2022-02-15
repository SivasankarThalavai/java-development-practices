package o_oops.abstractclass;

// It cannot be instantiated just like the interface.

abstract class Shape {

	// Declare fields
	String objectName = "";

	// Constructor of this class
	Shape(String name) {
		this.objectName = name;
	}

	// Non-abstract methods
	public void moveTo(int x, int y) {
		System.out.println(this.objectName + " " + "has been moved to" + " x = " + x + " and y = " + y);
	}

	// Abstract methods which will be
	abstract public double area();

	abstract public void draw();
}

class Rectangle extends Shape {

	int length, width;

	// Constructor
	Rectangle(int length, int width, String name) {

		// Super keyword refers to current instance itself
		super(name);

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
}

class Circle extends Shape {

	// Attributes of a Circle
	double pi = 3.14;
	int radius;

	Circle(int radius, String name) {
		// Super keyword refers to parent class
		super(name);
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
}

public class AbstractClassDemo {

	public static void main(String args[]) {

		// Creating the Object of Rectangle class and using shape class reference.
		Shape rect = new Rectangle(2, 3, "Rectangle");
		System.out.println("Area of rectangle: " + rect.area());
		rect.moveTo(1, 2);
		System.out.println(" ");

		// Creating the Objects of circle class
		Shape circle = new Circle(2, "Circle");
		System.out.println("Area of circle: " + circle.area());
		circle.moveTo(2, 4);

	}

}