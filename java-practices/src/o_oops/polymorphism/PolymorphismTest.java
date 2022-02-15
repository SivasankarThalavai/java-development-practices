package o_oops.polymorphism;

// the ability of a message to be displayed in more than one form

// Types of Polymorphism in Java

//Compile time polymorphism or method overloading or static banding
//Runtime polymorphism or method overriding or dynamic binding
//When a type of object is determined at a compiled time(by the compiler), it is known as static binding.
//When a type of object is determined at run-time, it is known as dynamic binding.

class Shape {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing triangle...");
	}
}

public class PolymorphismTest {

	public static void main(String args[]) {
		
		Shape shape = new Rectangle(); //upcasting
		shape.draw();
		shape = new Circle();
		shape.draw();
		shape = new Triangle();
		shape.draw();
	}
}