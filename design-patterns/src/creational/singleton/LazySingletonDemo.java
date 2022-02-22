package com.sivasankar.designpatterns.creational.singleton;


/*	If you are using multiple class loaders with Singletons you may run into issues. 
	Each class loader uses its own namespace 
	so you may in fact end up with multiple Singleton objects (one per class loader).
*/

class Singleton {

	// Static variable reference of single_instance of type Singleton
	private static Singleton single_instance = null;

	// Declaring a variable of type String
	public String s; // data member can be private, if you dont want to change

	// Constructor
	// Here we will be creating private constructor
	// restricted to this class itself
	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	// Static factory method
	// Static method to create instance of Singleton class
	public static synchronized Singleton getInstance() {
		if (single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}
}

public class LazySingletonDemo {

	public static void main(String[] args) {

		// Instantiating Singleton class with variable x
		Singleton x = Singleton.getInstance();

		// Instantiating Singleton class with variable y
		Singleton y = Singleton.getInstance();

		// Instantiating Singleton class with variable z
		Singleton z = Singleton.getInstance();

		// hash code for above variable as declared
		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());

		// Now changing variable of instance x
		// via toUpperCase() method
		x.s = (x.s).toUpperCase();

		System.out.println("\nString from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// Now again changing variable of instance x
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}

}
