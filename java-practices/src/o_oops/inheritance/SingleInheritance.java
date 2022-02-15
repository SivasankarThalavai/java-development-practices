package o_oops.inheritance;

class Animal {

	// field and method of the parent class
	String name;

	// method in the superclass
	public void eat() {
		System.out.println("I can eat");
	}

	protected String age;

	protected void displayAge() {
		System.out.println("I am an animal my age is > 0.");
	}
}

// dog inherit from Animal
class Dog extends Animal {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}

	// new method in subclass
	public void bark() {
		System.out.println("I can bark");
	}

	// overriding the eat() method
	@Override
	public void eat() {
		// call method of superclass
		super.eat();
		System.out.println("I eat dog food");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		// create an object of the subclass
		Dog labrador = new Dog();

		// access field of superclass
		labrador.name = "Quark";
		labrador.display();

		// call method of superclass using object of subclass
		labrador.eat();
		labrador.bark();

		// access protected field and method using the object of subclass
		labrador.age = "10";
		labrador.displayAge();
	}

}
