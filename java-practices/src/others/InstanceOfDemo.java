package others;

interface Printable {
}

class A1 implements Printable {
	public void a() {
		System.out.println("a method");
	}

}

class B1 implements Printable {
	public void b() {
		System.out.println("b method");
	}

}

class Call {
	void invoke(Printable p) {// upcasting
		if (p instanceof A1) {
			A1 a = (A1) p;// Downcasting
			a.a();
		}
		if (p instanceof B1) {
			B1 b = (B1) p;// Downcasting
			b.b();
		}

	}
}// end of Call class

public class InstanceOfDemo {

	public static void main(String args[]) {
		Printable p = new B1();
		Call c = new Call();
		c.invoke(p);
	}

}