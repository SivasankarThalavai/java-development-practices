package o_oops;

class A1 {

	A1() {
		// this(5);
		System.out.println("hello a");
	}

	A1(int x) {
		this();
		System.out.println(x);
	}
}

public class ThisConstructorDemo {

	public static void main(String[] args) {

		A1 a = new A1(10); // hello a 10
		// A1 a = new A1(); /// 5 hello a

	}

}
