package others;

class A {
	A() {
		System.out.println("parent class constructor invoked");
	}
}

public class InstanceInitializerBlockDemo1 extends A {

	InstanceInitializerBlockDemo1() {
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String[] args) {
		InstanceInitializerBlockDemo1 b = new InstanceInitializerBlockDemo1();
	}

}
