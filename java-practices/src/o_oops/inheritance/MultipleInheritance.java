package o_oops.inheritance;

class A {

	void msg() {
		System.out.println("Msg from A");
	}
}

class B {

	void msg() {
		System.out.println("Msg from B");
	}
}

public class MultipleInheritance extends A { // extends A,B {

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.msg();// Now which msg() method would be invoked?
	}

}
